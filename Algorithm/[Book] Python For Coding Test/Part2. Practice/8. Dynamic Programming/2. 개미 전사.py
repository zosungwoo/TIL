from itertools import combinations
n = int(input())
food_list = list(map(int, input().split()))

dp = [food_list[0], food_list[1]]
for i in range(2, n):
    dp.append(max(dp[i-1], dp[i-2] + food_list[i]))

print(max(dp))