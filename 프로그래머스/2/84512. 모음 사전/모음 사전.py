def solution(word):
    
    ans = []
    
    words = {'A','E', 'I', 'O', 'U', ''}
    for i in words:
        for j in words:
            for l in words:
                for k in words:
                    for q in words:
                        w = i+j+l+k+q
                        if w not in ans:
                            ans.append(w)
    
    ans.sort()
    answer = ans.index(word)
    
    
    return answer