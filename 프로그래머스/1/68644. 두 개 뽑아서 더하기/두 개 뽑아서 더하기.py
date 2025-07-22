def solution(numbers):
    l = len(numbers)
    answers = []
    for i1 in range(1,l):
        for i2 in range(0, i1):
            answers.append(numbers[i1]+numbers[i2])
    answer=list(set(answers))
    answer.sort()
    return answer