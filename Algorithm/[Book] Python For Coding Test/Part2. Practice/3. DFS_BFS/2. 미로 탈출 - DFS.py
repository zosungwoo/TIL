import sys
input = sys.stdin.readline

def dfs(x, y, i):
    if x < 0 or x >= n or y < 0 or y >= m or graph[x][y] == 0:
        return
    if x == n-1 and y == m-1:
        print(i)

    graph[x][y] = 0
    dfs(x+1, y, i+1)
    dfs(x-1, y, i+1)
    dfs(x, y+1, i+1)
    dfs(x, y-1, i+1)

n, m = map(int, input().split())
graph = [
    list(map(int, input().strip())) for i in range(n)
]

dfs(0, 0, 1)
