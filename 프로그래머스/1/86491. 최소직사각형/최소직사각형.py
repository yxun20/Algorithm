def solution(sizes):
    answer = 0
    maxs= []
    mins = []
    for x,y in sizes:
        if x > y: #둘중 큰거, 작은거 판별함
            maxs.append(x)
            mins.append(y)
            
        else:
            maxs.append(y)
            mins.append(x)
            
    
    maxx =max(maxs) #큰거 중에 제일 큰거
    minn =max(mins) #작은거 중에 제일 큰거
    
    answer = maxx*minn #곱하기
    return answer

