def solution(nums):
    nums_set = set(nums) #중복 제거
    big_nums = len(nums)//2 #최댓값 / 2 
    if len(nums_set) < big_nums:
        answer = len(nums_set)
    else:
        answer = big_nums
    return answer