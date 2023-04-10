import java.io.*;
// N개의 파일 이름이 주어지고, 길이는 같음
// 그후 n번째의 단어가 다르면 ? , 같으면 출ㄹ력



public class P1032 {
    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));  // 버퍼리더 사용 메모리때문


        int  n = Integer.parseInt(bf.readLine());   // 몇번 입력할건지.
        String arr[] = new String[n];  //String배열을 생성.

        for(int i=0; i<n; i++){
            arr[i] = bf.readLine();
         }                   // n번의 String문자열을 배열에 입력
        int len = arr[0].length(); // 그중 0번째 배열의 문자열의 숫자를 변수len에 저장  // 이유는 len번만큼 돌려서 글씨체크해야함/

        StringBuilder sb =new StringBuilder();  //StringBuilder 사용 변경할수없는 String변수를 변경하기위해..

        for(int i=0; i< len; i++){
            boolean b =true; // 모든파일 0번째 단어가 같으면 true, 아니면 false
            char c = arr[0].charAt(i); // c변수에 arr[0]의 i번째 단어를 삽입.
            for(int j =1; j<n; j++){   //2중 포문을 통해  arr[0]과 arr[1]의 단어 비교
                if(c != arr[j].charAt(i))
                    b=false;// 단어가 다르면 false 반환
            }
            if(b){
                sb.append(c); //true 일시 그대로 붙임
            }
            else{
                sb.append("?"); //false일씨 ?를 붙임.
            }



        }
        System.out.print(sb);






    }
}