package 문자열압축;

import java.util.Scanner;

public class Byeon {
    public static void main(String[] args) {
        // 입력1 : KKHSSSSSSSE
        // 출력1 : K2HS7E

        // 입력 2 : KSTTTSEEKFKKKDJJGG
        // 출력 2 : KST3SE2KFK3DJ2G2

        // 입력받기
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // 다음 문자가 반복뒤면 카운트해서 붙이기
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        String[] answer = str.split("");
        String index = answer[0];
        for (String x : answer) {
            if (x.equals(index)) {
                index=x;
                cnt++;
            }else{
                if (cnt == 1) {
                    sb.append(index);
                    index = x;
                }else{
                    String convert = String.valueOf(cnt);
                    sb.append(index).append(convert);
                    index = x;
                    cnt = 1;
                }
            }
        }
        if (cnt == 1) {
            sb.append(index);
        }else{
            String convert = String.valueOf(cnt);
            sb.append(index).append(convert);
        }
        System.out.println(sb.toString());
    }
}
