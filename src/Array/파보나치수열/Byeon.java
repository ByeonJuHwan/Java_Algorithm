package Array.파보나치수열;

import java.util.Scanner;

public class Byeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 배열을 하나만든다
        int[] arr = new int[n];
        // 배열의 첫번재와 두번째는 2로 고정시키고 3번재부터 전항과 전전항의 값을 더한걸로 반복문으로 채운다.
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        // 배열 가로로 출력
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
