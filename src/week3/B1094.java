package week3;

import java.util.Scanner;

public class B1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(); //원하는 막대의 길이

        int count = 0; // 풀로 붙이는 횟수
        int stick = 64;

        while(X>0) {
            //스틱의 길이가 X보다 크면 절반으로 자르기
            if(stick>X) stick /= 2;

                //스틱의 길이가 X보다 작으면 풀로 붙여
            else {
                count++;
                X-=stick;
            }
        }

        System.out.println(count);
    }
}

