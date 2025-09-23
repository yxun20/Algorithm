from operator import itemgetter


def solution(genres, plays):
    answer = []
    genres_dict = {} #그 장르에 있는 아이디, 재생 수 
    play_dict = {} # 장르 전체 재생 수
            
    for i in range (len(genres)):
        gen = genres[i]
        play = plays[i]
        
        # 장르별 곡 목록 누적
        if gen not in genres_dict:
            genres_dict[gen] = []
        genres_dict[gen].append([i, play])
        
        if gen in play_dict:
            play_dict[gen] += play
        else:
            play_dict[gen] = play
    
    
    sorted_keys = sorted(play_dict, key=play_dict.get, reverse=True)
    
    for gen in sorted_keys:
        sorted_gen = sorted(genres_dict[gen], key=lambda x: (-x[1], x[0]))
        top_songs = sorted_gen[:2]  # 상위 2곡 잘라내기
        for song in top_songs:
            answer.append(song[0])  # 인덱스만 추가
        
        
    
    return answer