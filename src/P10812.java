import java.io.*;
import java.util.StringTokenizer;

public class P10812 {

    //바구니 순서
    //입력 첫번째 줄  바구니수= N , 회전수 = M
    //두번쨰 순서바꾸기 ijk
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = bf.readLine();
        StringTokenizer st =new StringTokenizer(str," ");
        int N = Integer.parseInt(st.nextToken()); //바구니수
        int M = Integer.parseInt(st.nextToken()); // 회전수

        int basket[] = new int[N+1]; //+1을해줘야 경계값오류가안남.
        int newBasket[] = new int [N+1]; //교환한값을 넣어둘 배열

        for(int i =1; i<= N; i++){
             basket[i] = i; //배열값 할당
             newBasket[i] = i;  //배열값 할당

        }
        String method;
        StringTokenizer stt;

        int i,j,k;
        for(int s=0; s<M; s++){ //0~M번 회전
            method = bf.readLine();
            stt = new StringTokenizer(method);
            i= Integer.parseInt(stt.nextToken());
            j= Integer.parseInt(stt.nextToken());
            k= Integer.parseInt(stt.nextToken());

            int ii =i;
            for (int g = 0; g < j - i + 1; g++) {
                if (k + g <= j) {
                    newBasket[g + i] = basket[k + g];
                } else {
                    newBasket[g + i] = basket[ii];
                    ii++;
                }
            }

            for (int g = 1; g <= N; g++) {
                basket[g] = newBasket[g];
            }
        }

        for (int s = 1; s <= N; s++) {
            bw.write(newBasket[s] + " ");
        }


        bf.close(); //버퍼에 있는 값 전부 출력
        bw.flush();//남아있는 데이터를 모두 출력시킴
        bw.close(); //스트림을 닫음
        }


}
