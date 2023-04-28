package twoWeek;
// 총평: 아직 이문제 이해하기가 어려워서 BFS ,DFS 에대한 개념 문제를 봄. 검색하면서 풀긴했는데 아직 이해가 제대로 되지않았음
// 정형화된 그래프 문제 풀떄 쓰는 양식? 같은것들이 외우기가 힘듬.



// 이문제는 N개국을 여행하며  가장 적은 비행기를 경유하여 목적지에 가야함.
// 첫번쨰 줄에는 테스트 케이스 수.

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
첫 번째 줄에는 국가의 수 N(2 ≤ N ≤ 1 000)과 비행기의 종류 M(1 ≤ M ≤ 10 000) 가 주어진다.
이후 M개의 줄에 a와 b 쌍들이 입력된다. a와 b를 왕복하는 비행기가 있다는 것을 의미한다. (1 ≤ a, b ≤ n; a ≠ b)
주어지는 비행 스케줄은 항상 연결 그래프를 이룬다.
*/
public class BJ9372 {

    static int N, M, result;
    static boolean visit[];
    static int arr[][];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= testcase; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            result = 0;

            arr = new int[N + 1][N + 1];
            visit = new boolean[N + 1];
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                arr[u][v] = 1;
                arr[v][u] = 1;
            }
            bfs();
            System.out.println(result - 1);
        }
    }

    private static void bfs() {
        // TODO Auto-generated method stub
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        visit[1] = true;
        while (!queue.isEmpty()) {
            result++;
            int val = queue.poll();
            for (int i = 1; i <= N; i++) {
                if (arr[val][i] != 0 && !visit[i]) {
                    visit[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}


