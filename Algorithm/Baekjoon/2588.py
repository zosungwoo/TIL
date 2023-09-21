import sys
input = sys.stdin.readline

n1 = int(input())
n2 = int(input())

i = 1
while i < 1000:
    print(n1 * (n2 // i % 10))
    i *= 10

print(n1*n2)