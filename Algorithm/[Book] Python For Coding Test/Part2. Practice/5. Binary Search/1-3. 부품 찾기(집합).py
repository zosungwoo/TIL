import sys
input = sys.stdin.readline

n = int(input())
parts = set((map(int, input().split())))
m = int(input())
requestedParts = list(map(int, input().split()))

for requestedPart in requestedParts:
    if requestedPart in parts:
        print("yes")
    else :
        print("no")