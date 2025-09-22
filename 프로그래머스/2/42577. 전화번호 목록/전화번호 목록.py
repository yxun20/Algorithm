def solution(phone_book):
    phone_book.sort() #정렬해서
    
    for i in range(len(phone_book) - 1): #전체 비교
        if phone_book[i+1].startswith(phone_book[i]): #앞과 뒤 비교 접두사 비교 
            #앞의 문자열이 뒤의 글자(접두사)로 시작하면 false
            return False
    return True