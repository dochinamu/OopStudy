from collections import deque
class Stack:
    def __init__(self):
        self.llist = deque()
    def push(self, x):
        self.llist.append(x)
    def pop(self):
        return self.llist.pop() if self.llist else -1
    def size(self):
        return len(self.llist)
    def empty(self):
        if self.llist:
            return 0
        else:
            return 1
    def top(self):
        return self.llist[-1] if self.llist else -1
k = int(input())
s = Stack()
output=[]

for i in range(k):
    cmd = input().split()
    
    if cmd[0] == "push":
        s.push(cmd[1])
    elif cmd[0] == "pop":
        output.append(str(s.pop()))
    elif cmd[0] == "size":
        output.append(str(s.size()))
    elif cmd[0] == "empty":
        output.append(str(s.empty()))
    elif cmd[0] == "top":
        output.append(str(s.top()))
    else:
        output.append(str("error"))

print("\n".join(output))
    
    