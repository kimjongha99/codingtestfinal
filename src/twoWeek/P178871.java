package twoWeek;

import java.util.HashMap;

// 해쉬맵을 이용해야함.
// key - 이름   Value - 랭크순위 로 구성된 hashmap1
//  key - 랭크순위   Value - 이름 로 구성된 hashmap2
// 를 만들어 추월할경우 swap해주는 로직.
public class P178871 {
    class Solution {
        public String[] solution(String[] players, String[] callings) {
            String[] answer = new String[players.length];
        // 맵초기화
            HashMap<String, Integer>  mappingPlayer = new HashMap<>();
            HashMap<Integer,String>   mappingRank = new HashMap<>();

            // 부른수 반복.
            for(int i=0; i<callings.length; i++) {
                // 추월한유저 순우ㅣ
            int curRank = mappingPlayer.get(callings[i]);
                // 추월한 유저이름
                String player = mappingRank.get(curRank);
             // 바로앞플레이어
                String frontPlayer =mappingRank.get(curRank-1);

                // 이제 바꿔주기.
                mappingPlayer.put(player,curRank-1);
                mappingPlayer.put(frontPlayer,curRank);

                mappingRank.put(curRank-1, player);
                mappingRank.put(curRank,frontPlayer);

            }
            for(int i=0; i< players.length; i++){
                answer[i] = mappingRank.get(i);
            }
            return answer;
        }
    }

}
// 이 문제의 로직은 이해 가지만. 프로그래머스 제출법이 익숙치않아서 어렵다고생각함

