package 특정문자뒤집기;

import java.util.*;

public class Byeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자를 입력받는다.
        String str = sc.nextLine();
        // 리스트를 만들고 알파벳이면 담고 그 자리를 공백으로 만든다.
        char[] c = str.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < c.length; i++) {
            if (Character.isAlphabetic(c[i])) {
                list.add(c[i]);
                c[i] = ' ';
            }
        }
        // 리스트를 뒤집는다
        Collections.reverse(list);
        // 비어있는 공백에 원소를 넣는다
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                c[i] = list.get(0);
                list.remove(0);
            }
        }
        // 출력
        System.out.println(String.valueOf(c));
    }
}
