package 투포인터_슬라이딩윈도우.최대길이연속부분수열;

import java.util.Scanner;

public class Byeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0, max = 0, rt = 0, lt = 0, s = k;

        while (rt < n) {
            if (arr[rt] == 1) {
                cnt++;
                rt++;
            }else{
                if (s > 0) {
                    s--;
                    cnt++;
                    rt++;
                }else{
                    if (cnt > max) {
                        max = cnt;
                    }
                    cnt = 0;
                    lt++;
                    rt = lt;
                    s = k;
                }
            }
        }
        System.out.println(max);
    }
}
