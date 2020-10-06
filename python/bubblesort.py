n=int(input("enter no of input for array"))
lis=[int(input()) for i in range(n)]
for i in range(0,n):
    temp=0
    for j in range(0,n-i-1):
        if(lis[j]>lis[j+1]):
            temp=lis[j]
            lis[j]=lis[j+1]
            lis[j+1]=temp
print(lis)            
