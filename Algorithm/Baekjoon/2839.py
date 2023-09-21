import sys
input = sys.stdin.readline

n = int(input())

result = float('inf')

i = 0
while i <= n // 5:
    rest = n - (5*i)
    if rest % 3 == 0:
        result = min(i + rest // 3, result)

    i += 1

if result == float('inf'):
    result = -1

print(result)