from collections import deque

def solution(cards1, cards2, goal):
    answer = ''
    queue1 = deque()
    queue2 = deque()
    cnt = 0
    
    for i in range(len(cards1)):
        queue1.append(cards1[i])
    for i2 in range(len(cards2)):
        queue2.append(cards2[i2])
    
    for i3 in range(len(goal)):
        if queue1 and goal[i3] == queue1[0]:
            queue1.popleft()
        elif queue2 and goal[i3] == queue2[0]:
            queue2.popleft()
        else:
            cnt = 1
            break
    
    if cnt == 0:
        answer = 'Yes'
    elif cnt == 1:
        answer = 'No'
    
    return answer