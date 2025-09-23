def solution(participant, completion):
    
    #해시 테이블 생성
    dic ={ }
    for p in participant:
        if p in dic:
            dic[p] += 1
        else:
            dic[p] = 1
    for c in completion:
        if c in dic:
            dic[c] -= 1
    
    for p in participant:
        if dic[p] > 0:
            return p
        
    answer = p
    return answer