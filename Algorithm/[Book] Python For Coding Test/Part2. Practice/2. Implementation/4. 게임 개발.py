N, M = map(int, input().split())
A, B, d = map(int, input().split())
arr = []
for i in range(N):
    arr.append(list(map(int, input().split())))

cnt = 0

dx = [0, 1, 0, -1]
dy = [-1, 0, 1, 0]

while True:
    for i in range(4):
        nA = A + dx[(4 - d + i) % 4]
        nB = B + dy[(4 - d + i) % 4]

        if nA < 0 or nB < 0 or nA >= N or nB >= M:
            continue
        if arr[nA][nB] != 0:
            continue

        A, B = nA, nB
        arr[A][B] = -1
        d = (d + 3 - i) % 4
        cnt += 1
        break
    else:
        A = A + dx[(5 - d) % 4]
        B = B + dy[(5 - d) % 4]
        if arr[A][B] == 1:
            break

print(cnt)















'''
4 4
1 1 0
1 1 1 1
1 0 0 1
1 1 0 1
1 1 1 1
'''