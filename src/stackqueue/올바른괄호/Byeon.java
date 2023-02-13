package stackqueue.올바른괄호;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Byeon {
    public static void main(String[] args){
        // 입력 :  (A(BC)D)EF(G(H)(IJ)K)LM(N)
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]=='('){
                stack.push('(');
                arr[i] = ' ';
            } else if (arr[i]==')') {
                stack.pop();
                arr[i] = ' ';
            }else{
                if (!stack.isEmpty()) arr[i] = ' ';
            }
        }
        for (char x : arr) {
            if(x != ' ') answer += x;
        }
        System.out.println(answer);
    }
}
