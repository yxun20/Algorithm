def solution(numbers):
    l = len(numbers)
    answer = []
    i1=0
    for i1 in range(l-1):
        i2=i1+1
        for i2 in range(i1+1,l):
            sum = numbers[i1]+numbers[i2]
            answer.append(sum)
    answer = list(set(answer))
    answer.sort()
    return answer