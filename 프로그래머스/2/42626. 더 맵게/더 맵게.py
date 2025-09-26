import heapq

def solution(scoville, K):
    cnt = 0
    heapq.heapify(scoville)
    while scoville[0] <K:
        if len(scoville) <=1:
            return -1
        minn1 = heapq.heappop(scoville)
        minn2 = heapq.heappop(scoville)
        q = minn1 + (minn2*2)
        heapq.heappush(scoville,q)
        cnt += 1
        
        


    
    return cnt