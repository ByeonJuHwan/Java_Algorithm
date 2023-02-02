package String문자열.문자찾기;

import java.util.Scanner;

public class byeon {
    public static void main(String[] args) {
        // 입력 : Computercooler
        // 입력 : c
        // 출력 : 2

        // 내 풀이
        // 문자열을 입력받는다.
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        char c = sc.nextLine().charAt(0);
        // 대소문자를 구분하지 않으므로 전부 소문자로 바꾼뒤
        char[] result = answer.toLowerCase().toCharArray();
        c = Character.toLowerCase(c);
        // 배열안에 넣은뒤에 for문 한번으로 탐색 제한시간 1초이므로 충분히 가능.
        int cnt = 0;
        for (char a : result) {
            if (a == c) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
