//더하기사이클

//


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P1110 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

//        int N = sc.nextInt();
        int copy = N;
        int count =0;


        while (true) {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            count++;

            if(copy == N){
                break;

            }
        }
        System.out.println(count);

    }
}

