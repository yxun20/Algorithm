from itertools import combinations
from math import prod
def solution(clothes):
    
    dic = {}
    answer = 0
    
    for _, cloth in clothes: #clothes 에서 뒤에 옷 종류 이름만 뽑기
        if cloth in dic:
            dic[cloth] += 1 #옷 종류 갯수 각각 셈
        else:
            dic[cloth] = 1
    
    
    nums = list(dic.values())
    
    answer = prod(c+1 for c in nums) -1


    return answer
