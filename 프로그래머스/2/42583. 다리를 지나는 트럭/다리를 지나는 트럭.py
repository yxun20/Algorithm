from collections import deque   # 큐(Queue) 자료구조 사용을 위해 deque 불러오기

def solution(bridge_length, weight, truck_weights):
    
    time = 0                                     # 총 걸린 시간(초) 카운트
    bridge = deque([0] * bridge_length)          # 다리 위 상태 (처음에는 빈칸 0으로 다리 길이만큼 채움)
    truck_weights = deque(truck_weights)         # 대기 중인 트럭들을 큐에 넣음
    
    currentWeight = 0                            # 현재 다리 위 트럭 무게 합
    
    # 아직 다리를 건너지 않은 트럭이 남아 있는 동안 반복
    while len(truck_weights) != 0:
        time += 1                                # 1초가 흐름

        currentWeight -= bridge.popleft()        # 다리 맨 앞 칸을 비움 (트럭이 지나갔으면 무게 감소)

        # 다음 대기 트럭을 다리에 올릴 수 있는지 확인
        if currentWeight + truck_weights[0] <= weight:
            currentWeight += truck_weights[0]    # 다리 무게 갱신
            bridge.append(truck_weights.popleft())  # 트럭 진입 (대기열에서 빼서 다리에 올림)

        else:
            bridge.append(0)                     # 트럭이 못 올라오면 다리 칸만 앞으로 밀기 (빈칸 유지)
            
    # 마지막 트럭이 다리에 올라간 뒤, 다리를 다 지나가려면 bridge_length만큼 시간이 추가로 필요
    time += bridge_length
    
    return time                                  # 모든 트럭이 건너는 데 걸린 총 시간 반환
