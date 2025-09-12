from operator import itemgetter


def solution(genres, plays):
    answer = []
    genres_dict = {} #그 장르에 있는 아이디, 재생 수 
    play_dict = {} # 장르 전체 곡 수
    
    for i in range(len(genres)):
        genre = genres[i] #현재곡 장르
        play = plays[i] #현재곡 재생수
        
        if genre not in genres_dict:
            genres_dict[genre] = []
            play_dict[genre] = 0
        
        genres_dict[genre].append((i,play))
        play_dict[genre] += play
    
    sorted_genres = sorted(play_dict.items(), key=itemgetter(1), reverse=True) #두번째꺼(재생수 기준으로), 내림차
    
    
    for genre, _ in sorted_genres:
        songs = genres_dict[genre]
        # 먼저 id 오름차순 정렬
        songs.sort(key=itemgetter(0))
        # 그다음 재생 수 내림차순 정렬 (안정 정렬 이용)
        songs.sort(key=itemgetter(1), reverse=True)
        top_two = [song_id for song_id, _ in songs[:2]]
        
        answer.extend(top_two)
        
    
    return answer