n = int(input())

count = 0

for h in map(str, range(n+1)):
  for m in map(str, range(60)):
    for s in map(str, range(60)):
      if '3' in h + m + s:
        count += 1

print(count)