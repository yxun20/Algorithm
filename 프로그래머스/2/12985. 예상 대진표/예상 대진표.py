def solution(n,a,b):
    answer = 0
    cnt = 0
    while (a != b):
        a = (a+1) // 2
        b = (b+1) // 2
        cnt += 1
    answer = cnt
    return answer