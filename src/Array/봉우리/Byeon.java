package Array.봉우리;

import java.util.Scanner;

public class Byeon {
    public static void main(String[] args) {
        // 이건 문제에서 격자판 가장자리가 0으로 초기화 되어있지 않다고 나와있어도 풀수 있었어야한다. 이렇게 2차원 배열의 상하좌우
        // 를 비교하는 문제가 나올경우 가장자리를 0으로 둘러싸서 문제를 풀어나가야한다.

        // 입력 받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 2][n + 2];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // 상하좌우로 or문으로 묶기
        int cnt = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if(arr[i][j]>arr[i-1][j] && arr[i][j]>arr[i][j-1] && arr[i][j]>arr[i+1][j] && arr[i][j]>arr[i][j+1]){
                    cnt ++;
                }
            }
        }
        System.out.println(cnt);
    }
}
