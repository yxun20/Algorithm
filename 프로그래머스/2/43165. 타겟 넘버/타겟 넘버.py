def solution(numbers, target):
    answer = 0
    def dfs(index,curNum):
        nonlocal answer
        if index == len(numbers):
            if curNum == target:
                answer+=1
            return
        dfs(index+1,curNum+numbers[index])
        dfs(index+1,curNum-numbers[index])
        
    dfs(0,0)
    return answer