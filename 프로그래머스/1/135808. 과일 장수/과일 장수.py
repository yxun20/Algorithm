def solution(k, m, score):
    answer = 0
    score.sort(reverse=True)
    le = len(score)
    box = le//m
    q = 0
    total = 0
    for i1 in range(box):
        minn = 1000001
        for i2 in range(m):
            if minn >= score[q]:
                minn = score[q]
            q = q + 1
        total = total + (minn*m)
    answer = total
    return answer



