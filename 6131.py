a = list(map(int,input().split()))
b = list(map(int,input().split()))
if a[1] < b[1]:
    print(b[0]-a[0],b[0]-a[0]+1,b[0]-a[0])
elif a[1] == b[1] and a[2] <= b[2]:
    print(b[0]-a[0],b[0]-a[0]+1,b[0]-a[0])
else:
    print(b[0]-a[0]-1,b[0]-a[0]+1,b[0]-a[0])  