package String문자열.대소문자변환;

import java.util.Scanner;

public class Byeon {
    // 입력 : StuDY
    // 출력 : sTUdy

    public static void main(String[] args) {
        // 입력받기
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // char 배열로 변환후 isupper 이 메서드로 대소문자 구분후 변환
        char[] answer = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : answer) {
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            }else{
                sb.append(Character.toLowerCase(c));
            }
        }
        // 출력
        System.out.println(sb.toString());
    }

}
