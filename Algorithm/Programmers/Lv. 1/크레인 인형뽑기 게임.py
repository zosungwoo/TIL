def solution(board, moves):
    answer = 0

    stack = [[] for _ in range(len(board[0]))]

    for i in range(len(board) - 1, -1, -1):
        for j in range(len(stack)):
            doll = board[i][j]
            if doll != 0:
                stack[j].append(doll)

    basket = [0]
    for i in moves:
        if not stack[i - 1]:
            continue
        doll = stack[i - 1].pop()

        if basket[-1] == doll:
            basket.pop()
            answer += 2
        else:
            basket.append(doll)

    return answer