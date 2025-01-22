def solution(answers):
    human1 = list(range(1,6))
    human2 = [2,1,2,3,2,4,2,5]
    human3 = [3,3,1,1,2,2,4,4,5,5]
    sum = [0,0,0]
    a = 0
    b = 0
    c = 0
    q = 0
    
    for i in range(len(answers)):
        if human1[a] == answers[i]:
            print(f"휴먼 1{human1[a]}{answers[i]}")
            sum[0] = sum[0] + 1
            
        if human2[b] == answers[i]:
            print(f"휴먼 2{human2[b]}{answers[i]}")
            sum[1] = sum[1] + 1
            
        if human3[c] == answers[i]:
            print(f"휴먼 3{human3[c]}{answers[i]}")
            sum[2] = sum[2] + 1
            
        a = a + 1
        if a == 5:
            a = 0
        b = b + 1
        if b == 8:
            b = 0
        c = c + 1
        if c == 10:
            c = 0
    max = 0
    for i in range(3):
        if max < sum[i]:
            max = sum[i]
    answer = []
    for i in range(3):
        if sum[i] == max:
            answer.append(i+1)

    return answer