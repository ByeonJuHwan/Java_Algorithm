package HashMapTreeSet.학급회장;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Byeon {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        String[] arr = bf.readLine().split("");
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        int max = 0;
        String answer = "";
        for (int i = 0; i < n; i++) {
            count = map.getOrDefault(arr[i], 0) + 1;
            if (count > max) {
                max = count;
                answer = arr[i];
            }
            map.put(arr[i], count);
        }
        System.out.println(answer);
        bf.close();
    }
}
