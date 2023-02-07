package 투포인터_슬라이딩윈도우.두배열합치기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Byeon {
    public static void main(String[] args) {
        // 입력받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int[] arr2 = new int[t];
        for (int i = 0; i < t; i++) {
            arr2[i] = sc.nextInt();
        }
        List<Integer> answer = new ArrayList<>();
        int nt = 0;
        int tt = 0;
        while (nt < n && tt < t) {
            if (arr2[tt] < arr1[nt]) {
                answer.add(arr2[tt]);
                tt++;
            }else{
                answer.add(arr1[nt]);
                nt++;
            }
        }
        while (nt < n) {
            answer.add(arr1[nt]);
            nt++;
        }
        while (tt < t) {
            answer.add(arr2[tt]);
            tt++;
        }
        for(Integer x : answer) System.out.print(x + " ");
    }
}
