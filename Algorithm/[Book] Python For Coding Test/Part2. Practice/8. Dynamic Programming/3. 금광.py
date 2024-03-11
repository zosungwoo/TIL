n, m = map(int, input().split())
gold_list = list(map(int, input().split()))
dp = [
    gold_list[m*i:m*(i+1)] for i in range(n)
]

for j in range(1, m):
    for i in range(n):
        cur_gold = dp[i][j]
        dp[i][j] = dp[i][j-1] + cur_gold
        if i-1 >= 0:
            dp[i][j] = max(dp[i][j], dp[i-1][j-1] + cur_gold)
        if i+1 < n:
            dp[i][j] = max(dp[i][j], dp[i+1][j-1] + cur_gold)

print(max([dp[i][m-1] for i in range(n)]))