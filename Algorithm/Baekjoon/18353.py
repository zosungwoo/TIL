n = int(input())
power = list(map(int, input().split()))

dp = [1 for _ in range(n)]  # 기본값 1로 설정

for i in range(1, n):
    for j in range(i):  # 인덱스 i의 앞부분을 순회하며
        if power[j] > power[i]: # 인덱스 i보다 전투력이 더 높은 병사(인덱스 j)에 대해서만 dp 테이블 업데이트
            dp[i] = max(dp[i], dp[j] + 1)

print(n - max(dp))  # 제외된 병사 수 출력