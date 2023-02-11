package HashMapTreeSet.학급회장;

import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n,str));
    }

    private char solution(int n, String str) {
        char answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        System.out.println(map.containsKey('A'));
        System.out.println(map.containsValue(2));
        System.out.println(map.size()); // key의 개수를 알려준다.
        System.out.println(map.remove('A'));
        System.out.println(map.size());
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if(map.get(key)>max){
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }
}