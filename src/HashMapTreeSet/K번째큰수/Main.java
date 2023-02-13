package HashMapTreeSet.K번째큰수;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(arr, n, k));
    }

    private int solution(int[] arr, int n, int k) {
        int answer = -1;
        // TreeSet은 졍령해서 중복을 제거해준다.
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder()); // 내림차순 정렬.
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for (int x : set) {
            cnt++;
            if (cnt == k) return x;
        }
        return answer;
    }
}
