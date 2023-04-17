//프로그래머스 달리기경주.

// 선수들의 이름을 순위대로 출력하게.
// 이름이 불릴때마다 순위는 올라감.

import java.util.HashMap;
import java.util.Map;

//해쉬맵을 두개만듬. 순위. 이름.
public class P178871 {
    public String[] Solution(String[] players, String[] calling){
        Map<Integer,String> rank = new HashMap<>(); // 순위 해쉬맵
        Map<String, Integer> player = new HashMap<>();//이름해쉬맵

        for(int i=0; i<players.length; i++){
            rank.put(i+1, players[i]);  // 순위 추가
            player.put(players[i],i+1); // 이름 추가
        }
        for(String curPlayer : calling){
            int curRank = player.get(curPlayer);
            int frontRank = curRank - 1;         // 앞 플레이어의 순위
            String frontPlayer = rank.get(frontRank); //앞 플레이어 이름

            rank.put(frontRank, curPlayer); // 추월할 선수 이름 앞으로
            rank.put(curRank, frontPlayer); // 추월 당한 선수 뒤로
            player.put(frontPlayer, curRank); // 추월 당한 선수 순위 다운
            player.put(curPlayer, frontRank); // 추월한 선수 순위 업
        }

        String[] answer = new String[players.length];
        int cnt = 0;
        for(String s : rank.values()){
            answer[cnt++] = s;
        }

        return answer;
    }


}

