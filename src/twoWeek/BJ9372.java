package twoWeek;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 요세푸스 알고리즘문제
// 먼저 n명이 원을 그리며 서 있다. 각 사람에게는 '1'에서 'n'까지의 숫자가 지정
//시작하는 사람이 선택되며, 일반적으로 숫자가 '1'인 사람입니다. 이 사람은 서클에서 제외되고 다음 사람부터 계산이 시작.
//시작하는 사람부터 시계방향으로 'k'명을 세고 원에서 'k'번째 사람을 제거합니다
//방금 탈락한 사람부터 시계방향으로 'k'명을 다시 세어 'k'번째 사람을 다시 탈락시킨다.
//한 사람만 남을 때까지 이 과정을 계속합니다.
public class BJ9372 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>(); // 큐와 링크드리스트 만듬.


        int N = in.nextInt(); //몇명지정
        int K = in.nextInt(); //k번째 제거. 시계방향

        //큐에 1~N까지 삽입
        for(int i = 1; i <= N; i++) {
            q.add(i);
        }

        //스트링빌더를 통해 출력값 시작시 < 붙임.
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        /*
         *  마지막 부분의 출력은 > 괄호 전에 공백이 없기 때문에
         *  일괄적으로 출력하기 위해 마지막 원소만 남겨질 때까지만
         *  반복하고 마지막 원소는 그대로 출력한다.
         */


        while(q.size() > 1) {
            for(int i = 0; i < K - 1; i++) { 	// K-1번 앞에 있는 원소를 뒤로 보낸다.

                int val = q.poll();
                q.offer(val);
            }
            sb.append(q.poll()).append(", ");// K번째로 나오는 원소를 삭제함과 동시에 출력한다.
        }
        // 마지막 원소 출력한 뒤 > 도 붙여준다.
        sb.append(q.poll()).append('>');
        System.out.println(sb);
        }
    }
