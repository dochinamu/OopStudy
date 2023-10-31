import sys

k, len = map(int, sys.stdin.readline().split())

kLan = list(map(int, input().split()))

start = 1
end = max(kLan)

while start <= end:
    mid = (end + start) // 2
    
    howLong = 0
    for i in kLan:
        if i > mid:
            howLong += i - mid
    if howLong >= len: start = mid +1
    else: end = mid -1

print(end)
    
