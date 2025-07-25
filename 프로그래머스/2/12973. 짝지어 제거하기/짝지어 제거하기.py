def solution(s):
    le = len(s)
    stack = []
    
    for i in range (le):
        if stack and stack[-1] == s[i]:
            stack.pop()
        else:
            stack.append(s[i])
    
    if len(stack) == 0:
        answer = 1
    else:
        answer = 0

    return answer