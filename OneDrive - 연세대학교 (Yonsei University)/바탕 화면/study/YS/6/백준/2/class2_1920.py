# def selection_sort(arrary) :
#     for i in range(len(arrary)) :
#         min_index = i # 가장 작은 원소의 인덱스
#         for j in range(i+1, len(arrary)) :
#             if arrary[min_index] > arrary[j] :
#                 min_index = j
#         arrary[i], arrary[min_index] = arrary[min_index], arrary[i] # 스와프
        
#     return arrary
import sys


def merge_sort(arr):
    #  1개 이하로 분할될 때까지 분할
    if len(arr) < 2:
        return arr
    mid = len(arr)//2
    low_arr = merge_sort(arr[:mid])
    high_arr = merge_sort(arr[mid:])
    merged_arr = []
    l = h = 0
    while l < len(low_arr) and h< len(high_arr):
        if low_arr[l] < high_arr[h]:
            merged_arr.append(low_arr[l])
            l += 1
        else:
            merged_arr.append(high_arr[h])
            h += 1
    merged_arr += low_arr[l:]
    merged_arr += high_arr[h:]
    return merged_arr

n = int(input())
num = []
for _ in range(n):
    num.append(int(sys.stdin.readline()))

num = merge_sort(num)

for i in num:
    print(i)

