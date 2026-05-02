# ==========================
# Drone Delivery Navigation
# ==========================

import heapq
from collections import deque

# --------- Graph Definition ---------
graph = {
    'A': {'B': 2, 'C': 5, 'D': 1},
    'B': {'A': 2, 'D': 2, 'E': 3},
    'C': {'A': 5, 'D': 2, 'F': 3},
    'D': {'A': 1, 'B': 2, 'C': 2, 'E': 1, 'F': 4},
    'E': {'B': 3, 'D': 1, 'G': 2},
    'F': {'C': 3, 'D': 4, 'G': 1},
    'G': {'E': 2, 'F': 1, 'H': 3},
    'H': {'G': 3}
}

heuristic = {
    'A': 7,
    'B': 6,
    'C': 6,
    'D': 4,
    'E': 2,
    'F': 2,
    'G': 1,
    'H': 0
}

start = 'A'
goal = 'H'

# ===================================
# Depth-First Search (DFS)
# ===================================
def dfs(graph, start, goal):
    visited = set()
    nodes_expanded = 0
    
    def dfs_helper(node, path):
        nonlocal nodes_expanded

        nodes_expanded += 1

        if node == goal:
            return path

        visited.add(node)

        for neighbor in graph[node]:
            if neighbor not in visited:
                result = dfs_helper(neighbor, path + [neighbor])
                if result:
                    return result
        return None

    path = dfs_helper(start, [start])
    return path, nodes_expanded

# ===================================
# Breadth-First Search (BFS)
# ===================================
def bfs(graph, start, goal):
    visited = set()
    queue = deque()
    queue.append((start, [start]))
    nodes_expanded = 0

    while queue:
        node, path = queue.popleft()
        nodes_expanded += 1

        if node == goal:
            return path, nodes_expanded

        if node not in visited:
            visited.add(node)

            for neighbor in graph[node]:
                queue.append((neighbor, path + [neighbor]))

    return None, nodes_expanded

# ===================================
# Uniform Cost Search (UCS)
# ===================================
def ucs(graph, start, goal):
    frontier = []
    heapq.heappush(frontier, (0, start, [start]))
    explored = set()
    nodes_expanded = 0

    while frontier:
        cost, node, path = heapq.heappop(frontier)
        nodes_expanded += 1

        if node == goal:
            return path, cost, nodes_expanded

        if node not in explored:
            explored.add(node)

            for neighbor, weight in graph[node].items():
                heapq.heappush(frontier, (cost + weight, neighbor, path + [neighbor]))

    return None, None, nodes_expanded

# ===================================
# A* Search
# ===================================
def a_star(graph, start, goal, heuristic):
    frontier = []
    heapq.heappush(frontier, (heuristic[start], 0, start, [start]))
    explored = set()
    nodes_expanded = 0


    while frontier:
        f, g, node, path = heapq.heappop(frontier)
        nodes_expanded += 1
        
        if node == goal:
            return path, g, nodes_expanded

        if node not in explored:
            explored.add(node)

            for neighbor, weight in graph[node].items():
                new_g = g + weight
                new_f = new_g + heuristic[neighbor]
                heapq.heappush(frontier, (new_f, new_g, neighbor, path + [neighbor]))

    return None, None, nodes_expanded

# ===================================
# Run and Compare
# ===================================
if __name__ == "__main__":
    dfs_path, dfs_nodes = dfs(graph, start, goal)
    bfs_path, bfs_nodes = bfs(graph, start, goal)
    ucs_path, ucs_cost, ucs_nodes = ucs(graph, start, goal)
    a_path, a_cost, a_nodes = a_star(graph, start, goal, heuristic)

    print("\n===== RESULTS =====")

    print("\nDFS:")
    print("Path:", dfs_path)
    print("Nodes Expanded:", dfs_nodes)

    print("\nBFS:")
    print("Path:", bfs_path)
    print("Steps:", len(bfs_path) - 1)
    print("Nodes Expanded:", bfs_nodes)

    print("\nUCS:")
    print("Path:", ucs_path)
    print("Cost:", ucs_cost)
    print("Nodes Expanded:", ucs_nodes)

    print("\nA*:")
    print("Path:", a_path)
    print("Cost:", a_cost)
    print("Nodes Expanded:", a_nodes)