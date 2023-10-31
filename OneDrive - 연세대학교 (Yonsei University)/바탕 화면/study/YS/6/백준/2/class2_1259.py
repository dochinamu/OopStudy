# value = input("")
# while (value!="0"):
#     isPalindrome = True
#     for i in range(len(value)//2):
#         if value[i]!=value[len(value)-i-1]:
#             isPalindrome = False
#             break
#     if isPalindrome:
#         print("yes")
#     else:
#         print("no")
#     value = input("")

value = input("")
while (value != "0"):
    isPalindrome = True
    for i in range(len(value) // 2):
        if value[i] != value[len(value)-1-i]:
            isPalindrome = False
            break
    if isPalindrome:
        print("yes")
    else:
        print("no")
    value = input("")
