package String문자열.숫자만추출;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }

    private int solution(String str) {
        int answer = 0;
        for (char x : str.toCharArray()) {
            if (x >= 48 && x <= 57) { // 0~9는 48~57
                answer = answer * 10 + (x - 48);
            }
        }
        return answer;
    }
}
