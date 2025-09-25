def solution(s):
    answer = True
    ans = list(s)
    stack = []
    for i in ans:
        if i =='(':
            stack.append('(')
        elif i ==')':
            if not stack:
                return False
            if stack and stack.pop() != '(':
                return False
            
    if stack:
        return False

    return True