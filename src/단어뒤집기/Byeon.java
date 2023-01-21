package 단어뒤집기;

import java.util.Scanner;

public class Byeon {
    public static void main(String[] args) {
        // 입력
        // 3
        //good
        //Time
        //Big
        // 출력
        //doog
        //emiT
        //giB

        //3개를 입력 받는다
        Scanner sb = new Scanner(System.in);
        int n = sb.nextInt();

        for (int i = 0; i < n; i++) {
            String str = sb.next();
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.reverse();
            System.out.println(stringBuilder);
        }
    }
}
