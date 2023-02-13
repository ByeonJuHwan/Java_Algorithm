package stackqueue.괄호문자제거;

import java.util.Scanner;
import java.util.Stack;

public class Byeon {
    public static void main(String[] args){
        // 입력 :  (()(()))(()
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : arr) {
            if(x == '(') stack.push('(');
            else{
                if(stack.isEmpty()){
                    answer = "NO";
                    break;
                }else{
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()) answer = "NO";
        System.out.println(answer);
    }
}
