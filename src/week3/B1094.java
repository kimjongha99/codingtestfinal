package week3;

import java.sql.SQLOutput;
import java.util.Scanner;

//r그나마 쉬운문제..
//스틱의 길이가 64이므로  주어진 길이보다 크면 스틱 절반 자르고 , 원하는 길이보다 작으면  그길이에서 스틱길이 뻄
//그리고 count++
// x가 0보다 작아질때까지 반복.
public class B1094 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();// 막대길이 입력받고

    int count = 0; // 풀로 붙이는 횟수
    int stick =64; // 스틱의 길이

    while(x>0){
        // 스틱의 길이가 크면 절반자름
        if(stick>x){
            stick/=2;
        }
        else{
            // 스틱의 길이가 x보다 작으면 카운터증가 ,스틱붙임.

            count++;
            x-=stick;
        }
    }
        System.out.println(count);
      }


 }