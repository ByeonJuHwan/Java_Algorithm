package 투포인터_슬라이딩윈도우.최대매출;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,k,arr));
    }

    private int solution(int n, int k, int[] arr) {
        int answer = 0, sum = 0;
        for (int i = 0; i < k; i++) sum += arr[i];
        answer = sum;
        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            answer = Math.max(answer, sum);
        }
        return answer;
    }
}
