import sys
from bisect import bisect_left, bisect_right
input = sys.stdin.readline

def count_by_range(arr, leftValue, rightValue):
    left = bisect_left(arr, leftValue)
    right = bisect_right(arr, rightValue)
    return right - left

n, x = map(int, input().split())
nums = list(map(int, input().split()))

result = count_by_range(nums, x, x)
print(result if result > 0 else -1)