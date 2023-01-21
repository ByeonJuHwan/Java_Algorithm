package 회문문자열;

import java.util.Scanner;

public class Byeon {
    public static void main(String[] args) {
        // 입력 : gooG
        // 출력 : YES or NO

        //문자열 입력받기
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // revers로 같은지 확인
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) System.out.println("YES");
        else System.out.println("NO");
    }
}
