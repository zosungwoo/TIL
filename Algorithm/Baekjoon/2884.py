import sys
input = sys.stdin.readline

h, m = map(int, input().split())

m = m + 15 if m - 45 < 0 else m - 45
h = h - 1 if m >= 15 else h
h = 23 if h < 0 else h

print(h, m)