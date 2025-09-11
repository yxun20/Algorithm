def solution(want, number, discount):
    answer = 0
    
    want_dict = {}
    for i in range(len(want)): #원하는 상품 개수를 해시로 저장
        want_dict[want[i]] = number[i]
        #바나나 : 3
        
        # 2. discount 배열에서 시작점 ~ 시작점+10 구간을 확인
    for i in range (len(discount)-9): # 10일씩 보니까 -9 까지만 탐색
        # 현재 10일간 할인 품목
        window = discount[i:i+10]
        
        window_dict = {}
        # 현재 10일간의 품목을 카운팅해서 딕셔너리 만들기
        for item in window:
            if item in window_dict:
                window_dict[item] +=1
            else:
                window_dict[item] = 1
        
        #원하는 품목과 정확히 일치시 정답 카운트
        if window_dict == want_dict:
            answer +=1
    return answer