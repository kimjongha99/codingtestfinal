package week3;

import java.io.*;
import java.util.Scanner;
// 삼성 코딩역량 .   다채로운구간
// 어떤 법칙의 순열인지 이해하는 데 매우오래걸림..
public class S9614 {

    // boolean 배열을 사용해서 트루면 증가하는 식으로 함수 작성.
    private static boolean test(int i, int j, int[] arr, int K) {
        boolean[] temp = new boolean[K + 1];
        for (int k = i; k <= j; k++) {
            temp[arr[k]] = true;
        }
        for (int k = 1; k < temp.length; k++) {
            if (temp[k] == false) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {


        // 빠른 속도를 위한 입출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //testcase
        int TC = Integer.parseInt(br.readLine());
        for(int t=1; t<=TC; t++){
            String inputNK =br.readLine();
            String[] NK = inputNK.split(" ");

            //N,K 입력
            int N =Integer.parseInt((NK[0]));
            int K =Integer.parseInt((NK[1]));

            //N 크기의 배열생성
            int[] arr = new int[N];

            //수열 입력
            String inputSeq = br.readLine();
            String [] seq =inputSeq.split(" ");
            for(int i=0; i<N; i++){
                arr[i] = Integer.parseInt(seq[i]);
            }
            int result = 0;
            // 모든 경로 탐색은 1부터 N + K - 1 까지의 모든 합
            // N : 5 , K : 3
            // 1부터  N -  K +  1 까지의 합
            //       5 -  3  + 1 = 3

            // 1 + 2 + 3 = 6
            // 1부터 n 까지의 합 = n * (n + 1) / 2
            //                   3 * 4       / 2   = 6

            int size = N - K + 1;
            int len = arr.length;
            // size = 5 - 3 + 1 = 3
            // 0 4
            // 0 3
            // 0 2
            // 1 4
            // 1 3
            // 2 4

            // size = 4 - 2 + 1 = 3
            // 0 3
            // 0 2
            // 0 1
            // 1 3
            // 1 2
            // 2 3
            // 2 3
            for (int i = 0; i < size; i++) {
                for (int j = i + K - 1; j < len; j++) {
                    if (test(i, j, arr, K)) {
                        result++;
                    }
                }
            }
            bw.write("#" + t + " " + result + "\r\n");
        }
        br.close();
        bw.flush();
        bw.close();
        }

    }


