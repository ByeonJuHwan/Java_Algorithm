package 투포인터_슬라이딩윈도우.공통원소구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Byeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        int t = sc.nextInt();
        int[] arr2 = new int[t];
        for (int i = 0; i < t; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr2);

        // [1, 2, 3, 5, 9]
        // [2, 3, 5, 7, 8]
        List<Integer> answer = new ArrayList<>();
        int nt = 0, tt = 0;
        while (nt < n && tt < t) {
            if (arr1[nt] > arr2[tt]) {
                tt++;
            } else if (arr2[tt] > arr1[nt]) {
                nt++;
            } else {
                answer.add(arr2[tt]);
                tt++;
                nt++;
            }
        }
        for (Integer x : answer) {
            System.out.print(x + " ");
        }
    }
}
