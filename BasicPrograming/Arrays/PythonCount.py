a=[10 , 12, 2 , 12 , 34 , 45 , 2 , 4 , 7 ,8 , 9 , 5 , 6, 4 , 4, 3, 12 ]
count={}

for i in range(0 ,len(a)):
    if a[i] not in count:
        count[a[i]]=1
    else:
        count[a[i]] +=1

print(count.keys())
print(count.values())