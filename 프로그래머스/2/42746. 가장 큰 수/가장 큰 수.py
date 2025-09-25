
def solution(numbers):
    answer = ''
    l = len(numbers)
    ans = []
    for i in range (l):
        q = str(numbers[i])
        ans.append(q)
    ans.sort(key=lambda x: x*3, reverse=True)
    answer = ''.join(ans)
    
    
    if int(answer) == 0:
        answer = '0'
    return answer