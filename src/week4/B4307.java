package week4;

import java.util.Map;
import java.util.Scanner;

public class B4307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int I, n;

        for(int i=0; i<tc; i++){
            I = sc.nextInt();
            n =sc.nextInt();

            int min =0;
            int max =0;
            for(int j=0; j<n; j++){
                int ant =sc.nextInt();
                //최소시간: 왼쪽으로 떨어지는 시간. 오른쪽으로 떨어지는 시간에 비교하여 작은값 증 큰값이 전체 의 최소시간
                int temp = Math.min(ant, I-ant);
                min =Math.max(min,temp);

                max =Math.max(ant,max);

                max=Math.max(I-ant,max);
            }
            System.out.println(min+" "+max);
        }
    }
}
