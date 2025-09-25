def solution(citations):
    
    citations.sort(reverse=True)
    print(citations)
    n =len(citations)
    answer = []
    
    for i in range(citations[0],0,-1):
        for i2 in range (n):
            if i2+1 >= i and citations[i2] >= i and n-(i2+1) <= i:
                return i
    #for i in range (n):
        
        
        
        #if i+1 >= citations[i] and n-(i+1) <= citations[i]:
         #   return citations[i]
        
    return citations[0]
#6 5 3 1 0
#800 

#11 10 9 5 0

#4번 인덱스의 값이 4보다 이상이면 됨
