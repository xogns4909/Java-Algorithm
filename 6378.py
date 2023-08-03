# while True:
#     N = input()
#     if N == '0':          
#         break
#     result = 0
#     while True:             
#         tmp = 0
#         for n in N:         
#             tmp += int(n)
#         if tmp < 10:        
#             print(tmp)
#             break
#         else:              
#             N = str(tmp)
# import sys


# while(1):
#     num = int(sys.stdin.readline())

#     if num == 0: 
#         break
    
#     while(1):
#         num = sum(list(map(int, str(num))))

#         if(num // 10 == 0):
#             print(num)
#             break