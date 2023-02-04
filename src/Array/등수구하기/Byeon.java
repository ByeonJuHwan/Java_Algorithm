package Array.등수구하기;

import java.util.Scanner;

public class Byeon {
    public static void main(String[] args) {
        // 입력받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // 배열의 값이 전부 1인 배열을 준비하고 for문을 돌면서 자신보다 큰 숫자가 있으면 1씩증가시킨다.
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = 1;
        }

        // 시간복잡도 n**2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) answer[i]++;
            }
        }
        for (int x : answer) {
            System.out.print(x + " ");
        }
    }
}
