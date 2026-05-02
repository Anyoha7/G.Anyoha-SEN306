public class CheckoutFacade {
    private Inventory inventory;
    private Payment payment;
    private Shipping shipping;
    private Email email;

    public CheckoutFacade() {
        this.inventory = new Inventory();
        this.payment = new Payment();
        this.shipping = new Shipping();
        this.email = new Email();
    }

    public OrderResult checkout(String userId,
                                String productId,
                                double price,
                                String address) {

        // check stock
        if (!inventory.checkStock(productId)) {
            return new OrderResult(false, null, "Item out of stock");
        }

        // payment
        if (!payment.charge(userId, price)) {
            return new OrderResult(false, null, "Payment failed");
        }

        // reserve inventory
        inventory.reserve(productId);

        // shipping
        if (!shipping.isAvailable()) {
            payment.refund(userId, price);
            inventory.release(productId);
            return new OrderResult(false, null, "Shipping unavailable");
        }

        String trackingNumber = shipping.createLabel(address);
        shipping.schedulePickup(trackingNumber);

        email.send(
            userId,
            "Order confirmed",
            "Your order is on the way. Tracking: " + trackingNumber
        );

        return new OrderResult(
            true,
            trackingNumber,
            "Order placed successfully"
        );
    }
}