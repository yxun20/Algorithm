import math

def solution(brown, yellow):
    answer = []
    total = brown+yellow
    for i in range(int(math.isqrt(total)), 0, -1):
        if total % i == 0:
            w = total//i
            s = i
            if (w-2)*(s-2) == yellow:
                return w,s
    
    return answer