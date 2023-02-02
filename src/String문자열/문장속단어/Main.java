package String문자열.문장속단어;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos; // 자바가 저장하는 가장 최솟값.
        while ((pos = str.indexOf(' '))!=-1) { // 띄어쓰기의 위치의 인덱스를 리턴 indexOf()는 값이 없음면 -1을 리턴
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if(str.length()>m) answer=str;
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
