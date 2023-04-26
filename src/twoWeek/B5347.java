package twoWeek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


// 최소 공배수 구하는 문제.
//우선적으로 최소공배수를 알아야하면 최대공약수를 알아야한다.
//최대공약수는 유클리드 호제법을 통해 구하며 유클리드 알고리즘
// 최소공배수 = N*M/최대공약수 이다.  최대공약수, 최소공배수 알고리즘은암기.

public class B5347 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            long answer = Lcm(a, b);

            System.out.println(answer);

        }


    }

    private static long Lcm(int a, int b) {
        long big,small;

        if(a>b){
            big = a;
            small = b;
        } else{
            big = b;
            small = a;
        }       //큰값을 a로 바꾸는과정.

        long gcd = Gcd(big, small);  // 최대공약수 구하기
        long lcm = (big * small) / gcd;  // 최소공배수 구하는 식.

        return lcm;
    }

    private static long Gcd(long a, long b) {
        if( b==0){
            return  a;
        }else{
            return Gcd(b,a%b);
        }

    }
}
// 최소공배수를 구하는 알고리즘을  LCM, GCD 계산식 반복암기, 알고있으면좋을듯
