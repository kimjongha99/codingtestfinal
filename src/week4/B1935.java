package week4;

import java.util.Scanner;
import java.util.Stack;

/*


        double a =1;
        double b =2;
        double c =3;
        double d =4;
        double e =5;

        double result = a+b*c-d/e;
        System.out.printf("%.2f\n",result);
 */
public class B1935 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        double [] nums= new double[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        Stack<Double> stack = new Stack<>();
        int idx =0;
        for(int i=0; i<input.length();i++){
            char c =input.charAt(i);
            if (c>=65 && c<=90){
                stack.push(nums[c-'A']);//인덱스를 A,B,C... 순으로 꺼내는 방법
            } else if (c=='*'){
                stack.push(stack.pop()*stack.pop());
            } else if (c=='/'){
                Double tmp = stack.pop();
                stack.push(stack.pop()/tmp);
            } else if (c=='+'){
                stack.push(stack.pop()+stack.pop());
            } else if (c=='-'){
                Double tmp = stack.pop();
                stack.push(stack.pop()-tmp);
            }
        }
        //스텍 맨 위에가 결과가 된다
        System.out.printf("%.2f", stack.peek());
    }
}
