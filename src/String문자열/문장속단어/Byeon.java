package String문자열.문장속단어;

import java.util.Scanner;

public class Byeon {
    public static void main(String[] args) {
        // 입력 : it is time to study
        // 출력 : study

        // 입력받기
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // 공백기준으로 나누고 배열에 저장
        String[] pro = str.split(" ");
        // for문으로 인덱스를 하나씩 돌면서 maxlength 찾기
        int maxLengthStr = 0;
        String answer = "";
        for (String s : pro) {
            if (s.length() > maxLengthStr) {
                maxLengthStr = s.length();
                answer = s;
            }
        }
        // 출력
        System.out.println(answer);
    }
}
