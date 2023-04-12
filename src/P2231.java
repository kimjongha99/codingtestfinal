// 분해합

import java.util.Scanner;

public class P2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int size = String.valueOf(n).length();
        int start = n-(9*size);
        int ans=0;

        for(int i=start; i<n; i++){
            int sum =i;
            int k=1;
            while (k>0){
                sum+=k%10;
                k /= 10;
            }

        }
    }
}
