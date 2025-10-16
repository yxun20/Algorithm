def solution():
    put = int(input())
    inputt = put
    puts = str(put)
    putl = len(puts)
    ans = 0
    
    ans = (inputt - (10**(putl-1))+1)*putl
    for q in range (1,putl):
        ans = ans + 9*(10**(q-1))*q
        
    print(ans)   
    
    return ans

solution()