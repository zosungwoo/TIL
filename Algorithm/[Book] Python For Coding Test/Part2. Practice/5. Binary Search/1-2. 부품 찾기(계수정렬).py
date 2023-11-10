import sys
input = sys.stdin.readline

n = int(input())
parts = list(map(int, input().split()))
m = int(input())
requestedParts = list(map(int, input().split()))

arr = [0 for i in range(n+1)]
for part in parts:
    arr[part] = 1

for requestedPart in requestedParts:
    if parts[requestedPart] == 1:
        print("yes")
    else :
        print("no")