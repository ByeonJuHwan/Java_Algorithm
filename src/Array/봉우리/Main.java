package Array.봉우리;

import java.util.Scanner;

public class Main {
    // 시계방향으로 돌기위한 방위를 미리 설정해놈 삼중for문의 제일 마지막에 돌 배열
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        // 3중포문 확인
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n,arr));
    }

    private int solution(int n, int[][] arr) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true; // 봉우리 인지 아닌지 확인하는 boolean 타입
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] > arr[i][j]) { // && 의 순서중요!!!
                        // nx와 ny의 경계선 작업이 뒤로 가버리면 예외 발생!!
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }
}
