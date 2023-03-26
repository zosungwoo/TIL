data = input()

mapping = 'abcdefgh'
x = mapping.index(data[0]) + 1
y = int(data[1])

move1 = [2, -2]
move2 = [1, -1]

count = 0

for i in move1:
    for j in move2:
        cx = x + i
        cy = y + j
        if cx < 1 or cx > 8 or cy < 1 or cy > 8:
            continue

        count += 1

for i in move1:
    for j in move2:
        cx = x + j
        cy = y + i
        if cx < 1 or cx > 8 or cy < 1 or cy > 8:
            continue

        count += 1

print(count)