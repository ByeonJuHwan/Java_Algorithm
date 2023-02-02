package String문자열.중복문자제거;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.sloution(str));
    }

    private String sloution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            // 자기위치와 처음 발견되는 인덱스의 위치가 같으면 answer에다가 누적.
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }

        return answer;
    }
}
