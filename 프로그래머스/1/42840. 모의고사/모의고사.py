def solution(answers):
    hum1 = [1,2,3,4,5]
    hum2 = [2,1,2,3,2,4,2,5]
    hum3 = [3,3,1,1,2,2,4,4,5,5]     
    answer = []
    cnt1 = cnt2 = cnt3 = 0
    a =  h2 = h3 = 0
    for i in range (len(answers)):
        
        if answers[i] == hum1[a]:
            cnt1 += 1
        if answers[i] == hum2[h2]:
            cnt2 += 1
        if answers[i] == hum3[h3]:
            cnt3 += 1
        a += 1
        h2 += 1
        h3 += 1
        if a == 5:
            a=0
        if h2 == 8:
            h2=0
        if h3 == 10:
            h3=0
    
    maxx = max(cnt1, cnt2, cnt3)
    
    if cnt1 == maxx:
        answer.append(1)
    if cnt2 == maxx:
        answer.append(2)
    if cnt3 == maxx:
        answer.append(3)
    
    return answer