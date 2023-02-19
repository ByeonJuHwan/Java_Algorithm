package stackqueue.교육과정설계;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.println(T.solution(a,b));
    }

    private String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (char x : need.toCharArray()) Q.offer(x);
        for (char x : plan.toCharArray()) {
            if(Q.contains(x)){
                if (x != Q.poll()) return "NO";
            }
        }
        if(!Q.isEmpty()) return "NO"; // 필수과목을 전부 이수하지 않음경우.
        return answer;
    }
}
