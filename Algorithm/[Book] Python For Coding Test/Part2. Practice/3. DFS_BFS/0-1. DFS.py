def dfs(graph, v, visited):
    visited[v] = True
    print(v, end=' ')

    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)

graph = [
    [],
    [2, 3, 8],  # 1번 노드 ~
    [1, 7],
    [1, 4, 5],
    [3, 5],
    [3, 4],
    [7],
    [2, 6, 8],
    [1 ,7]  # ~ 8번 노드
]

visited = [False] * 9  # [False for _ in range(9)] -> 더 느림

dfs(graph, 1, visited)