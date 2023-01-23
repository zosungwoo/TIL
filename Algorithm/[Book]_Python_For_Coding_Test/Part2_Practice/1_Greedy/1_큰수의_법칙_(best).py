n, m, k = map(int, input().split())
arr = list(map(int, input().split()))

arr.sort(reverse=True)

first = arr[0]
second = arr[1]

repeat = m // (k + 1)
repeat_rest = m % (k + 1)

result = ((first * k + second) * repeat) + (first * repeat_rest)
print(result)