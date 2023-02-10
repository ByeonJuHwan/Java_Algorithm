package 투포인터_슬라이딩윈도우.연속된자연수의합;

import java.util.Scanner;

public class Byeon {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        int lt = 1, sum = 0, cnt = 0;
        for (int rt = 1; rt <= (n/2)+1; rt++) {
            sum += arr[rt];
            if(sum==n) cnt++;
            while (sum >= n) {
                sum -= arr[lt];
                lt++;
                if(sum==n) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
