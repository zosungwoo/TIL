# N이 100억 이상일 때 1씩 빼는 작업이 시간을 매우 지연시킴. 따라서 아래처럼 하면 됨
N, K = map(int, input().split())

i = 0
while N >= K:
  subtract = N - (N // K) * K
  i += subtract
  N -= subtract

  N //= K
  i += 1
  print(N)

i += N - 1

print(i)
