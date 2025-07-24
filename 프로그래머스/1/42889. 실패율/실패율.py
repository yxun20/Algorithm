def solution(N, stages):
    answer = [0] * N
    ansCnt = [0] * (N + 1)
    ansPer = [0] * N  # 스테이지 1~N만 사용

    # 각 스테이지 머무는 사람 수 계산
    for s in stages:
        if s <= N:
            ansCnt[s] += 1

    Noclear = 0
    for i in range(1, N + 1):
        if len(stages) - Noclear == 0:
            ansPer[i - 1] = 0
        else:
            ansPer[i - 1] = ansCnt[i] / (len(stages) - Noclear)
        Noclear += ansCnt[i]

    ansHum = ansPer[:]  # 인덱스 순서 기록
    print("초기 실패율:", ansHum)

    ansPer.sort(reverse=True)  # 실패율 내림차순
    print("정렬된 실패율:", ansPer)

    for i in range(N):
        for i2 in range(N):
            if ansPer[i] == ansHum[i2]:
                answer[i] = i2 + 1  # 스테이지 번호
                ansHum[i2] = -1  # 중복 방지
                break

    return answer
