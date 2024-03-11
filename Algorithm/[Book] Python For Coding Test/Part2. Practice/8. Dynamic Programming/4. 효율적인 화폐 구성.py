n, m = map(int, input().split())

coin_list = [int(input()) for _ in range(n)]

dp = [-1] * 10001
for coin in coin_list:
    dp[coin] = 1

for i in range(max(coin_list)+1, m+1):
    candidate_list = []
    for coin in coin_list:
        if dp[i - coin] != -1:
            candidate_list.append(dp[i - coin])

    dp[i] = min(candidate_list) + 1

print(dp[m])