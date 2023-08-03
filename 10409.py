n,max = map(int,input().split())
time =[]
i=0
result =0
for i in range(n):
    time[i] =int(input())
while(result < 180):
    result=result+time[i]
    i++
print(i)    