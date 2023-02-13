package stackqueue.올바른괄호;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        // 여는괄호랑 알파벳을 무조건 스택에 push
        // 닫는 괄호를 만나면 닫는 괄호 포함해서 그 위에 문자열은 전부 pop
        // 즉 스택에 남아있는 값들이 정답이된다.
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') {
                // pop의 리턴값은 꺼낸값 계속 돌면서 pop
                // 알파벳이면 true 이다가 false로 변하면 종료
                while (stack.pop() != '(');
            }else stack.push(x);
        }
        for (int i = 0; i < stack.size(); i++) answer += stack.get(i);
        return answer;
    }
}
