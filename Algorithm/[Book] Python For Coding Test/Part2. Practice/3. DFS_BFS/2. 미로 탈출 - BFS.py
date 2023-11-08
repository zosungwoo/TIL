import sys
from collections import deque
input = sys.stdin.readline

def bfs(x, y):
    queue = deque()
    queue.append((x, y))

    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if nx < 0 or nx >= n or ny < 0 or ny >= m or graph[nx][ny] != 1:
                continue
            graph[nx][ny] = graph[x][y] + 1
            queue.append((nx, ny))

    return graph[n-1][m-1]


n, m = map(int, input().split())
graph = [
    list(map(int, input().strip())) for i in range(n)
]

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

print(bfs(0, 0))
