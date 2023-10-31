def binary_search(a,x):
    left = 0
    right = len(a)-1
    while left < right:
        mid = (left + right)//2
        if a[mid]<x:
            left = mid +1
        else:
            right = mid
    if left == right and a[left] == x:
        foundpos = left
        return foundpos
    else:
        return -1

nAndK=(input(""))
n=int(nAndK.split()[0])
k=int(nAndK.split()[1])

a = []
for i in range(n):
    listItem = int(input(""))
    a.append(listItem)

q = []
for i in range(k):
    x = int(input(""))
    q.append(x)


left = int(a[0])
right = int(a[n-1])
for x in q:
    result = binary_search(a,x)
    print(result)