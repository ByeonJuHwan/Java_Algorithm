package 투포인터_슬라이딩윈도우.연속된자연수의합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        // 입력받기
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }

    private int solution(int n) {
        int answer = 0,sum=0, lt=0;
        int m = n / 2 + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }
        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if(sum == n) answer++;
            while (sum >= n) {
                sum -= arr[lt];
                lt++;
                if(sum==n) answer++;
            }
        }
        return answer;
    }
}
