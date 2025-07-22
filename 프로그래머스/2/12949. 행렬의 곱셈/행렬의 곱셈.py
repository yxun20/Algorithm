def solution(arr1, arr2):
    total = 0
    a3 = len(arr1)       # arr1의 행 수 → 결과 행
    a1 = len(arr1[0])    # arr1의 열 수 = arr2의 행 수
    a2 = len(arr2[0])    # arr2의 열 수 → 결과 열

    answer = []

    
    for j in range (a3):
        row = []
        for k1 in range (a2):
            for k in range (a1):
                total = total + arr1[j][k] * arr2[k][k1] 
            row.append(total)
            total = 0
        answer.append(row)

    return answer