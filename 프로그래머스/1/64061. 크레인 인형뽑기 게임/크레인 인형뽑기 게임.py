def solution(board, moves):
    answer = 0
    le1 = len(board)
    le2 = len(moves)
    stack = []
    
    for i2 in range (le2):
        n = moves[i2] - 1
        
        for i1 in range (le1):
            if board[i1][n] != 0:
                catch = board[i1][n] 
                board[i1][n] = 0
                
                if stack and stack[-1] == catch:
                    stack.pop()
                    answer = answer + 2
                else:
                    stack.append(catch)
                break
        
                    
    return answer