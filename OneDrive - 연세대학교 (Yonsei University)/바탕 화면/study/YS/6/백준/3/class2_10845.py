from collections import deque


class Queue:
    def __init__(self):
        self.llist = deque()
        
    def push(self, x):
        self.llist.append(x)
    def pop(self):
        return self.llist.popleft() if self.llist else -1
    def size(self):
        return len(self.llist)
    def empty(self):
        if self.llist:
            return 0
        else:
            return 1
    def front(self):
        return self.llist[0] if self.llist else -1
    def back(self):
        return self.llist[-1] if self.llist else -1
    

k = int(input())
q = Queue()
output=[]

for i in range(k):
    cmd = input().split()
    
    if cmd[0] == "push":
        q.push(cmd[1])
    elif cmd[0] == "pop":
        output.append(str(q.pop()))
    elif cmd[0] == "size":
        output.append(str(q.size()))
    elif cmd[0] == "empty":
        output.append(str(q.empty()))
    elif cmd[0] == "front":
        output.append(str(q.front()))
    elif cmd[0] == "back":
        output.append(str(q.back()))
    else:
        output.append(str("error"))

print("\n".join(output))
