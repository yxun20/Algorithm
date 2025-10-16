def solution(name, yearning, photo):
    answer = []
    dic = {}
    for i in range (len(name)):
        dic[name[i]] = yearning[i]
        
    for ph in photo:
        summ = 0
        for ph2 in ph:
            summ += dic.get(ph2, 0)  # 없는 이름은 0점
        answer.append(summ)
    return answer