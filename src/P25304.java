import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25304 {
    //문제 설명 영수증에 적힌 구매 물건의 가격 , 구매물건의 개수 ,
    //총구매 금액을보고
    //가격X개수  = 총금액확인

    /*입력
    첫째 줄에는 영수증에 적힌 총 금액
     x가 주어진다.

    둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수
    N이 주어진다.

    이후
    N개의 줄에는 각 물건의 가격
    a와 개수
    b 가공백을 사이에 두고 주어진다*/


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(bf.readLine());
        int Num = Integer.parseInt(bf.readLine());
        int s= 0;

        for(int i =0; i<Num; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int price =Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            s = s+(price*N);

        }
        if(total ==s){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}
