package String문자열.replaceAll정규식사용;

import java.util.Scanner;

public class Byeon {
    public static void main(String[] args) {
        // 입력 : found7, time: study; Yduts; emit, 7Dnuof
        // 출력 : YES

        // 입력받기
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // String replaceAll 사용해서 문자 제거하기
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        // 뒤집어서 같은지 확인하고 출력
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) System.out.println("YES");
        else System.out.println("NO");
    }
}
