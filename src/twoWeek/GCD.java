package twoWeek;
//최대공약수 구하는 유클리드 알고리즘.

// 임의의 두 자연수가 a,b가있을때 둘중 큰값이 a라고 가정을해보면
// a를 b로 나눈 나머지를 n이라고하면 (a%b=n)
// n이 0일때 , b가 최대 공약수가됩니다.
// n이 0이아니라면 반복해서 0이될때까지 재귀를 돌립니다.
import java.util.Scanner;

public class GCD {

    public  static  long gcd(long a ,long b) {
        if(b==0){
            return a;
        }else

        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();
        long result;
        System.out.println(a +"   "+b);

        result = gcd(a, b);

        System.out.println(result);


    }

}
