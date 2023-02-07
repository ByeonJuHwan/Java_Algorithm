package 투포인터_슬라이딩윈도우.최대매출;

import java.util.Scanner;

public class Byeon {
    public static void main(String[] args) {
        // 입력받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        // 첫 창문을 만드는 과정.
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        // 12 15 11 더해진 38
        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
