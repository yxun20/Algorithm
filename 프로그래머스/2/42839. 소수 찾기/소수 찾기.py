from itertools import permutations
def solution(numbers):
    count = 0
    test_num = []
    
    for i in range (len(numbers)):
        case = list(set(map(''.join,permutations(numbers,i+1))))
        print(case)
        for q in case:
            test_num.append(int(q))
    
    print(test_num)
    test_num = list(set(test_num))
    print(test_num)
    
    for num in test_num:
        if isPrime(num) == True:
            count += 1
    
    answer = count
    
    return answer


def isPrime(x):
    if x<2:
        return False
    else:
        for i in range(2,x):
            if x % i == 0:
                return False

    return True