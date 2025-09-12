def solution(id_list, report, k):
    reported_user = { } #신고당한 유저
    count = { } #처리 결과 메일을 받은 유저
    
    for r in report:
        user_id, reported_id = r.split() #분리 저장
        if reported_id not in reported_user: #신고 기록 없으면
            reported_user[reported_id] = set() #공간 만들어주고
        reported_user[reported_id].add(user_id) #유저 아이디를 신고당한 유저에 매핑해서 저장
    
    for reported_id, user_id_lst in reported_user.items() :
        if len(user_id_lst) >= k: #정지 기준 이상 사람이 있는 곳에 있는 사람만
            for uid in user_id_lst: #각 사람의 신고 성공 카운트 계산
                if uid not in count:
                    count[uid] = 1
                else:
                    count[uid] += 1
                    
    answer = []
    
    for i in range(len(id_list)): 
        if id_list[i] not in count: #사람안에 신고성공한 사람 없으면 0 넣어줌
            answer.append(0)
        else:
            answer.append(count[id_list[i]]) #있으면 그 카운트 수 넣어줌
    return answer