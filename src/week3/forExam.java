package week3;

import java.util.Scanner;

public class forExam {
    public static void main(String[] args) {
        /*
    출력예) ********** (5행10열)
           **********
           **********
           **********
           **********
         */
        for(int i=0; i<5; i++){
            for(int j=0; j<10; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    /*
출력예)    1 1 1 1 1
          2 2 2 2 2
          3 3 3 3 3
          4 4 4 4 4
          5 5 5 5 5      */
        for(int i=1; i<6; i++){
            for(int j=0; j<5;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();


        /*
   출력예) 1 2 3 4 5
          1 2 3 4 5
          1 2 3 4 5
          1 2 3 4 5
          1 2 3 4 5
         */

        for(int i=1; i<6;i++){
            for(int j=1; j<6; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        /*
          2 3 4 5 6
          3 4 5 6 7
          4 5 6 7 8
          5 6 7 8 9
          6 7 8 9 10
         */
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.print(i+j+2);
            }
            System.out.println();
        }
        System.out.println();

        /*
         2 * 1 =  2          3 * 1 =  3          4 * 1 =  4
         2 * 2 =  4          3 * 2 =  6          4 * 2 =  8
                              ....
         2 * 9 = 18          3 * 9 = 27          4 * 9 = 36
         */
        for (int i=1;i<=9;i++){
            for (int j=2;j<=4;j++){
                System.out.print(j +"*"+i+ "="+j*i+"  ");
            }
            System.out.println();
        }

        System.out.println();

        /*
          2 * 1 = 2          2 * 2 = 4          2 * 3 =  6        2 * 4 =  8          2 * 5 = 10
          3 * 1 = 3          3 * 2 = 6          3 * 3 =  9        3 * 4 = 12          3 * 5 = 15
          4 * 1 = 4          4 * 2 = 8          4 * 3 = 12        4 * 4 = 16         4 * 5 = 20
         */
        for (int i=2;i<=4;i++){
            for (int j=1;j<=5;j++){
                System.out.print(i +"*"+j+ "="+ j*i +"  ");
            }
            System.out.println();
        }

        System.out.println();

        /*
          입력예) 3 4
    출력예) 1 2 3 4
           2 4 6 8
           3 6 9 12
         */

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=1; i<=a;i++){
            for(int j=1;j<=b;j++){
                System.out.print(i* j +" ");

            }
            System.out.println();
        }


        System.out.println();

        /*
   출력예) a 1 2 3 4
          b c 5 6 7
          d e f 8 9
          g h i j 10
         */

//        int i, j;
//        char c = 'a';
//        int d = 0;
//
//        for( i=1; i<=4; i++)
//        {
//            for( j=1; j<=i; j++)
//            {
//                System.out.print(c+++" ");
//            }
//            for( j=1; j<=5-i; j++)
//            {
//                System.out.print(++d+" ");
//            }
//
//            System.out.println();
//        }


        System.out.println();

        /*
          2
          10 3
          2
          6
          7
         */
        int x= sc.nextInt();

        for(int i=1; i<=x; i++){
            int y = sc.nextInt();
            int z = sc.nextInt();

            for(int j=1;j<=z;j++){


            }


        }




    }
}
