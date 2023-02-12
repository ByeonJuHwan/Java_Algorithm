package HashMapTreeSet.아나그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Byeon {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] A = bf.readLine().toCharArray();
        char[] B = bf.readLine().toCharArray();

        Map<Character, Integer> map1= new HashMap<>();
        for (char x : A) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }

        Map<Character, Integer> map2 = new HashMap<>();
        for (char x : B) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        String answer = "";
        for (char x : A) {
            if (!Objects.equals(map1.get(x), map2.get(x))) {
                answer = "NO";
                break;
            }else{
                answer = "YES";
            }
        }
        System.out.println(answer);
    }
}
