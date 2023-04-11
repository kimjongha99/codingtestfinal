// 단어 정렬

// 주의 할점. 단어 길이순으로 정렬후, 길이가같은경우 사전순으로 정렬
// 그리고 중복단어 제거후 한번만 출력


//
//Comparator<? super T>c 에 대한이해
//
//        Arrays.sort()메서드는 두객체를 비교해서 위치를 바꿀지말지를정함.
//
//        기본적으로 Comparator는 객체를 비교할수있게 만드는 인터페이스임.
//
//        Arrays.sort(arr, new Comparator<String>() 즉여기서 String은 타입을 설정해준것
//
//        Comparator 의 타입을넣었으면 ,  compare 메서드를 오버라이딩하면됌
//
//public int compare(String s1, String s2) { 즉여기서 오버라이딩한 compare의
//        메서드타입이 int인이유는 3가지 리턴값이 있음 . 양의정수, 0,음의정수
//        양수일경우 위치교환,  0이나 음수인경우 위치교환X
//
//        여기서 compareTo() 메서드는 사전순정렬임.



        import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
        import java.util.Scanner;

public class P1181 {

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N= Integer.parseInt(br.readLine()); // 몇글자입력받을건지
//
//
//        String arr[] = new String[N];  //배열에 저장
//
//        for(int i=0; i<N; i++){
//            arr[i]= br.readLine();
//        }                                 // for문써서 N번만큼 배열에 단어 저장
//
//        Arrays.sort(arr, new Comparator<String>() {    //중요한 부분  위에설명 하겠음
//
//            @Override
//            public int compare(String o1, String o2) {
//                if(o1.length() == o2.length()){
//                    return  o1.compareTo(o2);
//                }else{
//                    return o1.length() - o2.length();
//                }
//
//            }
//        });
//
//        StringBuilder sb =new StringBuilder();
//
//        sb.append(arr[0]).append('\n');
//
//        for(int i=1; i<N; i++){
//            if(!arr[i].equals(arr[i-1])){
//                sb.append(arr[i]).append('\n');
//            }
//        }
//        System.out.println(sb);


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String arr[]   = new String[N];


        for(int i=0; i<N; i++){
            arr[i]= sc.nextLine();
        }

        Arrays.sort(arr, new Comparator<String>(){


            @Override
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }else{
                    return s1.length() - s2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        sb.append(arr[0]).append('\n'); //System.out.println(arr[0]);

        for (int i = 1; i < N; i++) {
            // 중복되지 않는 단어만 출력
            if (!arr[i].equals(arr[i - 1])) {
                sb.append(arr[i]).append('\n');
            }
        }
        System.out.println(sb);
    }

}