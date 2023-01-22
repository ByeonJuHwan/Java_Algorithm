package 숫자만추출;

import java.util.Scanner;

public class Byeon {
    public static void main(String[] args) {
        // 입력 : g0en2T0s8eSoft
        // 출력 : 208

        // 입력받기
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // 숫자가아니면 전부 삭제 replaceAll로 없애기
        str = str.replaceAll("[^0-9]", "");
        // 자연수로 변환
        Integer answer = Integer.parseInt(str);
        System.out.println(answer);
    }
}
