def solution(people, limit):
    people = sorted(people,reverse=True)
    cnt = 0
    for i in people:
        sum = i
        if sum + people[-1] <= limit:
            people.pop(-1)
        cnt += 1
    
    return cnt