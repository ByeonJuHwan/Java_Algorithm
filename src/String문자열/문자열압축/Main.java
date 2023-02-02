package String문자열.문자열압축;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String answer = "";
        str = str + " "; // 여기서 문자열하나들 더안주면 i와 i+1을 비교할때 마지막 인덱스에서 예외가 발생한다.
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            }else{
                answer += str.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }
        return answer;
    }
}
