from collections import deque   # 큐(Queue) 구조를 쓰기 위해 deque 사용

def solution(priorities, location):
    answer = 0                           # 몇 번째로 출력되는지 세는 카운트 변수
    deq_list = deque(priorities)         # 문서들의 중요도를 큐로 변환
    
    while True:
        pop = deq_list.popleft()         # 맨 앞의 문서를 꺼냄

        # 만약 이게 마지막 문서라면 → 바로 출력되므로 answer+1 리턴
        if len(deq_list) == 0:
            return answer + 1
    
        # 뒤에 더 높은 우선순위가 있으면 다시 큐의 맨 뒤로 보냄
        if pop < max(deq_list):
            deq_list.append(pop)

        # 뒤에 더 높은 우선순위가 없으면 현재 문서를 출력
        else:
            answer += 1                   # 출력 카운트 증가
            if location == 0:             # 내가 찾던 문서라면?
                return answer             # 지금 출력된 순서가 정답

        # 📌 location 업데이트 (내 문서 위치 추적)
        if location == 0:                 # 방금 꺼낸 문서가 내가 찾던 문서였으면
            location = len(deq_list) - 1  # 다시 뒤로 보내졌으니 맨 끝으로 이동
        else:
            location -= 1                 # 아니면 그냥 한 칸 앞으로 땡겨짐
