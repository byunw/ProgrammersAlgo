def solution(n):
    moves = []
    hanoi(n,1,3,2,moves)
    return moves 
    
def hanoi(n,start,to,mid,moves):
    if n==1:
       moves.append([start,to])
       return
    hanoi(n-1,start,mid,to,moves)
    moves.append([start,to])
    hanoi(n-1,mid,to,start,moves)
    
