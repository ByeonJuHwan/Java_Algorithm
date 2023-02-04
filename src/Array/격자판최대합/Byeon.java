package Array.격자판최대합;

import java.util.Scanner;

public class Byeon {
    public static void main(String[] args) {
        // 2차원 배열 입력 받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // 가장 큰 값을 max로 두고 각 행, 열, 대각선을 구할때마다 max 값 바꾸기
        // 행 시작
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j]; // 한 행의 합계 구하기
            }
            if (sum > max) {
                max = sum; // max의 값을 sum으로 초기화 시켜준다
            }
            sum = 0; // 다시 다음 행을 더하기 위해서 sum의 값을 0으로 초기화
        }

        //열 시작
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[j][i]; // 한 열의 합계 구하기
            }
            if (sum > max) {
                max = sum; // max의 값을 sum으로 초기화 시켜준다
            }
            sum = 0; // 다시 다음 행을 더하기 위해서 sum의 값을 0으로 초기화
        }

        // 왼쪽에서 오른쪽 대각선 시작
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
            if (sum > max) max = sum;
            sum=0;
        }

        // 오른쪽에서 왼쪽 대각선 시작
        for (int i = n - 1; i >= 0; i--) {
            sum += arr[i][i];
            if (sum > max) max = sum;
        }

        // max 출력
        System.out.println(max);
    }
}
