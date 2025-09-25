def solution(array, commands):
    answer = []
    for cmd in commands:
        ans = []
        i = cmd[0]
        j = cmd[1]
        k = cmd[2]
        array_n = array
        for q in range (i-1,j):
            print(array_n[q])
            ans.append(array[q])
        ans.sort(reverse=False)
        print(ans)
        answer.append(ans[k-1])
        
        
    
    
    return answer