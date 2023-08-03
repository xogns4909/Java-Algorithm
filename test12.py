import sys
while(True):
    a = sys.stdin.readline().rstrip()
    if a=='0':
        break
    result = 0
    for i in range(len(a)):
        sum = 1
        for j in range(len(a)-i,0,-1):
            sum *= j
        result += int(a[i]) * sum
    print(result)        
