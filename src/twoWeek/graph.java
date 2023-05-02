package twoWeek;

/* 정점+ 간선 = 그래프

deg(x) = 모든 정점의 차수의 합 = 간선의 개수 두배

그래프를  저장하는 대표적인 두가지방법. 1. 인접행렬 , 2. 인접 리스트
인접행렬.
int [][] adj = int new [행][열];  O(v^2)만큼 공간필요
인접행렬은 구현하기는쉽지만 메모리이슈가있다. 공간복잡도를 너무잡아먹음.


인접리스트.
ArrayList <ArrayList<Integer>> abj;
 정점의개수 ,   정점의 차수


문제풀이팁.
문제에서 정점 , 간선에 대한 정확한 정의를 찾기.
간선 저장 방식을 확인하기.

그래프에서 탐색이란.= 시작점에서 간선을 0개이상 사용해서 갈수있는 정점들은 무엇인가.

1.깊이우선 탐색. DFS
재귀함수를 이용/


2.너비우선 탐색,BFS
큐생성.  스타트 q넣어줌.
 */

import java.io.*;
import java.util.*;

public class graph {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, M, V;
    static ArrayList<Integer>[] adj;  //인접리스트
    static boolean[] visit;

    static void input() {
        N = scan.nextInt();
        M = scan.nextInt();
        V = scan.nextInt();
        adj = new ArrayList[N + 1];
        for (int i = 1;i <= N; i++)
            adj[i] = new ArrayList<>();


        for (int i = 0; i < M; i++) {
            int x = scan.nextInt(), y = scan.nextInt();
            adj[x].add(y);
            adj[y].add(x);
        }

        for (int i = 1;i<=N;i++)
            Collections.sort(adj[i]); //모든정점마다 정렬.
    }


    // x 를 갈 수 있다는 걸 알고 방문한 상태
    static void dfs(int x) {
        // x 를 방문했다.
        visit[x] =true;
        sb.append(x).append(" ");
        // x 에서 갈 수 있는 곳들을 작은 번호부터 모두 방문한다.

        for(int y: adj[x]){
            // y 를 이미 갈 수 있다는 사실을 안다면, 굳이 갈 필요 없다.
            if(visit[y])continue;
            // y에서 갈 수 있는 곳들도 확인 해보자
            dfs(y);
        }
    }

    // start 에서 시작해서 갈 수 있는 정점들을 모두 탐색하기
    static void bfs(int start) {
        Queue<Integer> que = new LinkedList<>();
        // start는 방문 가능한 점이므로 que에 넣어준다.
        que.add(start);
        visit[start] = true;  // start를 갈 수 있다고 표시하기 (중요!!!)
        while (!que.isEmpty()) {  // 더 확인할 점이 없다면 정지
            int x = que.poll();

            sb.append(x).append(' ');
            for (int y: adj[x]){
                if (visit[y]) continue;  // x 에서 y 를 갈 수는 있지만, 이미 탐색한 점이면 무시

                // y를 갈 수 있으니까 que에 추가하고, visit 처리 하기!
                que.add(y);
                visit[y] = true;
            }
        }
    }

    static void pro() {
        // 모든 x에 대해서 adj[x] 정렬하기
        /* TODO */
        visit = new boolean[N+1];

        dfs(V);
        sb.append("\n");// dfs 출ㅇ력후 줄바꿈
        for(int i=1; i<=N; i++) visit[i]= false;// bfs를 출력하기위해서 초기화
        bfs(V);



        System.out.println(sb);
    }

    public static void main(String[] args) {
        input();
        pro();
    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
