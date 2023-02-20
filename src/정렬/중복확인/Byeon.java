package 정렬.중복확인;

import java.util.*;

public class Byeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(getAnswer(n, arr));
    }

    private static String getAnswer(int n, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) != 1) return "D";
        }
        return "U";
    }
}