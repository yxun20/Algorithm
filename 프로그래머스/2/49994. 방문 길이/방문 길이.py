def solution(dirs):
    answer = 0
    XL = [[0 for _ in range(11)] for _ in range(11)]
    YL = [[0 for _ in range(11)] for _ in range(11)]
    X = 6
    Y = 6
    
    for i in range (len(dirs)):
        if dirs[i] == 'U' and Y < 11:
            YL[X-1][Y-1] = 1
            Y = Y + 1
            print(X,Y)
            
        elif dirs[i] == 'D' and 1 < Y:
            YL[X-1][Y-2] = 1
            Y = Y - 1
            print(X,Y)
            
        elif dirs[i] == 'R' and X < 11:
            XL[Y-1][X-1] = 1
            X = X + 1
            print(X,Y)
            
        elif dirs[i] == 'L' and 1 < X:
            XL[Y-1][X-2] = 1
            X = X - 1
            print(X,Y)
            
            
    for i1 in range (11):
        for i2 in range (11):
            if YL[i1][i2] > 0: #1번 이상 방문한 곳만 카운트
                answer = answer + 1
    for i1 in range (11):
        for i2 in range (11):
            if XL[i1][i2] > 0:
                answer = answer + 1
    
    
    
    return answer