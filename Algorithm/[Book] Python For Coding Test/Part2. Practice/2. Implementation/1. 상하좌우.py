N = int(input())
move = input().split()
c = [1,1]

for i in move:
  if i == 'R':
    c[1] += 1
  elif i == 'L':
    c[1] -= 1
  elif i == 'U':
    c[0] -= 1
  else:
    c[0] += 1

  if c[0] == 0:
    c[0] += 1
  elif c[0] == N+1:
    c[0] -= N

  if c[1] == 0:
    c[1] += 1
  elif c[1] == N+1:
    c[1] -= 1

print(c[0], c[1])