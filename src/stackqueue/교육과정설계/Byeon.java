package stackqueue.교육과정설계;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Byeon {
    public static void main(String[] args) {
        // 입력 : CBA CBDAGE
        // 출력 : YES
        Scanner sc = new Scanner(System.in);
        String require = sc.nextLine();
        String str = sc.nextLine();
        Queue<Character> Q = new LinkedList<>();
        ArrayList<Character> list = new ArrayList<>();
        for (Character x : require.toCharArray()) list.add(x);
        for (Character x : str.toCharArray()) Q.offer(x);
        while (!Q.isEmpty()) {
            char x = Q.poll();
            if (list.size() == 0) break;
            else{
                if (x == list.get(0)) {
                    list.remove(0);
                }
            }
        }
        String answer = "YES";
        if (list.size() != 0) answer = "NO";
        System.out.println(answer);
    }
}
