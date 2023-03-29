def solution(s, n):
    answer = ''
    
    n_alpha = ord('z') - ord('a') + 1
    
    for ch in s:
        if ch.isupper():
            ch = chr(ord('A') + (ord(ch)-ord('A')+n) % n_alpha)
        elif ch.islower():
            ch = chr(ord('a') + (ord(ch)-ord('a')+n) % n_alpha)
            
        answer += ch
    return answer