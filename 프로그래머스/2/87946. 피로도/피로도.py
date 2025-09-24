from itertools import permutations
def solution(k, dungeons): #permutations
    max_piro = 0
    for dungeon in permutations(dungeons, len(dungeons)):
        cnt = 0
        piro = k
        
        for p_piro, loss_piro in dungeon:
            if p_piro <= piro:
                piro = piro - loss_piro
                cnt += 1
            
        max_piro = max(max_piro,cnt)
    
    answer = max_piro
    return answer