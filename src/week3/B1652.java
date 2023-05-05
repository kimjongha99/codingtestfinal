package week3;
// 누울 자리를 찾아라.

import java.util.Scanner;

public class B1652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next()); // 방크기 N입력받고

        String[] arr = new String[N]; //방크기 N 만큼배열만듬

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();  //N만큼 문자입력받고
        }

        int row = 0;  //행
        int col = 0; // 열

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i].charAt(j) == '.') {
                    if (j + 1 < N && arr[i].charAt(j + 1) == '.') {
                        if (j + 2 >= N || (j + 2 < N && arr[i].charAt(j + 2) == 'X')) {
                            row++;
                        }
                    }
                }
                if (i + 1 < N && arr[i + 1].charAt(j) == '.') {
                    if (i + 2 >= N || (i + 2 < N && arr[i + 2].charAt(j) == 'X')) {
                        col++;
                    }
                }
            }

        }
        System.out.println(row + " " + col);

    }
}
