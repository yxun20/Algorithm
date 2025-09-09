from collections import deque

def solution(progresses, speeds):
    queue = deque()
    for i in range(len(progresses)):
        queue.append([progresses[i], speeds[i]])
        
    cnt = 0
    answer = []
    while len(queue) >0:
        for i in range(len(queue)):
            p, s = queue.popleft()
            p = p + s
            queue.append([p,s])
            
        cnt = 0
        while queue and queue[0][0] >= 100:
            queue.popleft()
            cnt +=1
        if cnt > 0:
            answer.append(cnt)
            
        i=0
            
            
    
    return answer