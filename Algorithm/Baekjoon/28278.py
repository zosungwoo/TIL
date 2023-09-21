import sys
input = sys.stdin.readline

class Stack:
    def __init__(self):
        self.stack = []
    
    def push(self, n):
        self.stack.append(n)

    def pop(self):
        if len(self.stack) == 0:
            print(-1)
        else:
            print(self.stack.pop())

    def num_of_stack(self):
        print(len(self.stack))
    
    def isEmpty(self):
        if len(self.stack) == 0:
            print(1)
        else:
            print(0)

    def print_top(self):
        if len(self.stack) == 0:
            print(-1)
        else:
            print(self.stack[-1])

n = int(input())
stack = Stack()

for i in range(n):
    user_input = list(map(int, input().split()))
    command = user_input[0]

    if command == 1:
        stack.push(user_input[1])
    elif command == 2:
        stack.pop()
    elif command == 3:
        stack.num_of_stack()
    elif command == 4:
        stack.isEmpty()
    elif command == 5:
        stack.print_top()
    else:
        break