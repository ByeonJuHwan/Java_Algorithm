package 중복문자제거;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Byeon {
    public static void main(String[] args) {
        // 입력 : ksekkset
        // 출력 : kset

        // 문자 입력받기
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // Set 만들어서 집어넣기
        Set<String> set = new LinkedHashSet<>(Arrays.asList(str.split("")));
        // 순서대로 출력해서 String으로 변환하기
        StringBuilder sb = new StringBuilder();
        for (String s : set) {
            sb.append(s);
        }
        System.out.println(sb.toString());
    }
}
