package stackqueue.후위식연산;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

    private int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) stack.push(Integer.parseInt(String.valueOf(x)));
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(x == '+') stack.push(lt + rt);
                else if(x=='-') stack.push(lt - rt);
                else if(x == '*') stack.push(lt * rt);
                else answer = stack.push(lt / rt);
            }
        }
        answer = stack.pop();
        return answer;
    }
}
