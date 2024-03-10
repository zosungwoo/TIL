from itertools import combinations
n = int(input())


dp = [0] * (n+1)

for i in range(2, n+1):
    candidate_list = []
    if i % 5 == 0:
        candidate_list.append(dp[i//5])
    if i % 3 == 0:
        candidate_list.append(dp[i//3])
    if i % 2 == 0:
        candidate_list.append(dp[i//2])
    candidate_list.append(dp[i-1])
    dp[i] = min(candidate_list) + 1

print(dp[n])