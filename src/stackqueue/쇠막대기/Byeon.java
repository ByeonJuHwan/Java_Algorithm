package stackqueue.쇠막대기;

import java.util.Scanner;
import java.util.Stack;
public class Byeon {
    public static void main(String[] args) {
        // 입력 : ()(((()())(())()))(())  출력 : 17
        // 입력 : (((()(()()))(())()))(()()) 출력 : 24
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]=='(') stack.push(arr[i]); // ( 여는 괄호가 나오면 무조건 push
            else{
                // arr에서 바로 앞의 값을 비교해서 같은 ) 닫는 괄호면 거기는 막대기의 끝이라고 가정
                // 반대로 바로앞이 값이 여는 괄호 ( 면은 레이저
                if(arr[i-1]=='('){
                    stack.pop();
                    answer += stack.size();
                }else { // 바로 앞의 값이 ) 닫는 괄호인경우 막대기의끝
                    stack.pop();
                    answer += 1;

                }
            }
        }
        System.out.println(answer);
    }
}
