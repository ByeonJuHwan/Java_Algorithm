package 투포인터_슬라이딩윈도우.연속부분수열;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int cnt = 0, lt = 0, sum = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) cnt++;
            while (sum >= m) {
                sum -= arr[lt];
                lt++;
                if (sum == m) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
