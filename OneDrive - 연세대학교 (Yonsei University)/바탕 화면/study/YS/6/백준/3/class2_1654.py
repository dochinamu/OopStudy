import sys

k, n = map(int, sys.stdin.readline().split())

kLan= []
for i in range(k):
    i = int(input())
    kLan.append(i)

start = 1
end = max(kLan)

while start <= end:
    mid = (end + start) // 2
    
    howMany = 0
    for i in kLan:
        howMany += i // mid 
    if howMany >= n: start = mid +1
    else: end = mid -1

print(end)
    
