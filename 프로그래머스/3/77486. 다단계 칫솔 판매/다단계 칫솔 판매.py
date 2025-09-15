def solution(enroll, referral, seller, amount):
    answer = []
    parent = dict(zip(enroll,referral))
    #zip(enroll, referral)은 (enroll[i], referral[i]) 형태의 쌍을 순서대로 생성
    #dict(...)가 그 쌍들을 딕셔너리로 변환하여 enroll[i] -> referral[i] 매핑을 만듦. 
    #예: enroll=["a","b"], referral=["-","a"] → {"a":"-","b":"a"}가 됨.
    total = {name: 0 for name in enroll}
    #딕셔너리 컴프리헨션임. enroll을 순회하며 각 name을 키로, 값을 0으로 초기화함.
    #결과는 {"a": 0, "b": 0, ...}
    for i in range(len(seller)):
        money = 100 * amount[i] #받은 돈
        cur_name = seller[i] #현재 있는 사람
        
        while money > 0 and cur_name != '-': #돈이 남아있고, 사람이 없는 경우가 아닌 경우
            total[cur_name] = total[cur_name] + (money - (money // 10)) #현재 돈을 그 사람의 토탈 통장에 넣어줌
            money = money // 10 #현재 남은돈
            cur_name = parent[cur_name] #위로 올림, edward(현재사람):mary(추천해준 사람) edward -> mary, 
            #cur_name이 mary 로 바뀌어서 parent[mary]하면 mary:?? 의 ??(추천인)으로 이동
    return [total[name] for name in enroll]