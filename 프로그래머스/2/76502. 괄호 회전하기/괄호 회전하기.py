def solution(s):
    le = len(s)
    answer = 0
    for i in range (le):
        stack = []
        clear = 0
        for i2 in range (le):
            num = (i + i2) % le
                
            if s[num] == '(':
                stack.append(s[num])
                    
            elif s[num] == '[':
                stack.append(s[num])
                    
            elif s[num] == '{':
                stack.append(s[num])
                
            elif s[num] == ')':
                if not stack or stack.pop() != '(':
                    clear = 1
                
            elif s[num] == ']':
                if not stack or stack.pop() != '[':
                    clear = 1
            
            elif s[num] == '}':
                if not stack or stack.pop() != '{':
                    clear = 1
            
        if clear == 0 and len(stack) == 0:
            answer = answer + 1
        
        
            
                
        
            
            
    return answer