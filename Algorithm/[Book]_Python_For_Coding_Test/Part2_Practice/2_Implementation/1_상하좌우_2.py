N = int(input())
move = input().split()
x, y = 1, 1

m1 = [-1,1,0,0]  # U, D
m2 = [0,0,-1,1]  # L, R
mapping = ['U', 'D', 'L' ,'R']

for i in move:
  for j in range(len(mapping)):
    if i == mapping[j]:
      tmpx = x + m1[j]
      tmpy = y + m2[j]

  if tmpx == 0 or tmpx == N+1 or tmpy == 0 or tmpy == N+1:
    continue

  x = tmpx
  y = tmpy

print(x,y)