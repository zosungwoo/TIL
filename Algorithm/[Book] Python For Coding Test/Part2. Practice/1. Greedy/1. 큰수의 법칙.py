n, m, k = map(int, input().split())
arr = list(map(int, input().split()))

arr.sort(reverse=True)

result = 0
i = 0
while m != 0:
  if i == 0:
    if k <= m:
      result += arr[i] * k
      m -= k
    else:
      result += arr[i] * m
      m -= m
    i += 1
  else:
    result += arr[i]
    m -= 1
    i = 0

print(result)