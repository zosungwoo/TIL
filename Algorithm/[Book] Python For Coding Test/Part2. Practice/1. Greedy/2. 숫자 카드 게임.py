N, M = map(int, input().split())

data = []
for i in range(N):
  data.append(list(map(int, input().split())))

max = 0
for i in data:
  m = min(i)
  if max < m:
    max = m

print(max)