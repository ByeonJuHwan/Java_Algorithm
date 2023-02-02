package String문자열.문자거리;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력 : teachermode e
        // 출력 : 1 0 1 2 1 0 1 2 2 1 0
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for (int x : T.solution(str, c)) {
            System.out.print(x + " ");
        }
    }

    private int[] solution(String str, char t) {
        int[] answer = new int[str.length()];
        int p = 1000;

        // 왼쪽에서 오른쪽
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                p=0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }

        // 오른쪽에서 왼쪽
        p = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == t) {
                p=0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = Math.min(answer[i],p);
            }
        }
        return answer;
    }
}
