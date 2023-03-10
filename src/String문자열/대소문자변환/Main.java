package String문자열.대소문자변환;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
        return answer;
    }

    public static void main(String[] args) {
        // 입력 : StuDY
        // 출력 : sTUdy
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
