import sys

input = sys.stdin.readline


def dfs(x, y):
    if x < 0 or x >= n or y < 0 or y >= m:
        return 0

    if graph[x][y] == 0:
        graph[x][y] = 1
        dfs(x + 1, y)
        dfs(x, y + 1)
        return 1
    return 0


n, m = map(int, input().split())
graph = [
    list(map(int, input().strip())) for i in range(n)
]

result = 0
for i in range(n):
    for j in range(m):
        result += dfs(i, j)

print(result)
