import sys
input = sys.stdin.readline

n, x = map(int, input().split())
nums = list(map(int, input().split()))

firstLoc, lastLoc = n, -1

# firstLoc 탐색
start, end = 0, n-1
while start <= end:
    mid = (start+end) // 2
    if nums[mid] == x:
        if mid < firstLoc:
            firstLoc = mid
        end = mid - 1
    elif nums[mid] < x:
        start = mid + 1
    else:
        end = mid - 1

# lastLoc 탐색
start, end = 0, n-1
while start <= end:
    mid = (start+end) // 2
    if nums[mid] == x:
        if mid > lastLoc:
            lastLoc = mid
        start = mid + 1
    elif nums[mid] < x:
        start = mid + 1
    else:
        end = mid - 1

print(lastLoc-firstLoc+1 if lastLoc != -1 else -1)