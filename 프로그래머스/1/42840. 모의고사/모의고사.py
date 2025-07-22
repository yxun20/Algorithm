def solution(answers):
    human1 = [1,2,3,4,5]
    human2 = [2,1,2,3,2,4,2,5]
    human3 = [3,3,1,1,2,2,4,4,5,5]
    point = [0,0,0]
    a, b, c = 0, 0, 0
    answer = []
    
    for i1 in range(len(answers)):
        if answers[i1] == human1[a]:
            point[0] = point[0] + 1
            
        if answers[i1] == human2[b]:
            point[1] = point[1] + 1
        
        if answers[i1] == human3[c]:
            point[2] = point[2] + 1
            
        a = a + 1
        b = b + 1
        c = c + 1
        
        if a == 5:
            a = 0 
        if b == 8:
            b = 0
        if c == 10:
            c = 0
    
    ans = max(point)
    
    for i2 in range (3):
        if ans == point[i2]:
            answer.append(i2+1)
            
    return answer