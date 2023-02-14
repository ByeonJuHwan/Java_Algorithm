package stackqueue.후위식연산;

import java.util.Scanner;
import java.util.Stack;

public class Byeon {
    public static void main(String[] args) {
        // 입력 : 352+*9-
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        Stack<Integer> stack = new Stack<>();
        for (char x : arr) {
            if (Character.isDigit(x)) {
                stack.push(Integer.parseInt(String.valueOf(x)));
            }else{
                int right = stack.pop();
                int left = stack.pop();
                int answer = 0;
                if(x=='+') answer = left + right;
                else if(x=='-') answer = left - right;
                else if(x == '*') answer = left * right;
                else answer = left / right;
                stack.push(answer);
            }
        }
        System.out.println(stack.pop());
    }
}
