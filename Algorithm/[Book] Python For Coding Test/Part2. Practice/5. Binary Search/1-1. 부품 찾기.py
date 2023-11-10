import sys
input = sys.stdin.readline

n = int(input())
parts = sorted(list(map(int, input().split())))
m = int(input())
requestedParts = list(map(int, input().split()))

for requestedPart in requestedParts:
    start, end = 0, n-1
    while start <= end:
        mid = (start + end) // 2
        if parts[mid] == requestedPart:
            print("yes")
            break
        elif parts[mid] > requestedPart:
            end = mid - 1
        else:
            start = mid + 1
    else:
        print("no")