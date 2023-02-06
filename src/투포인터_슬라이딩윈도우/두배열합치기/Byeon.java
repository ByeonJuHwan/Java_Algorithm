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
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < t) {
            if (arr2[p2] < arr1[p1]) {
                answer.add(arr2[p2]);
                p2++;
            }else{
                answer.add(arr1[p1]);
                p1++;
            }
        }
        while (p1 < n) {
            answer.add(arr1[p1]);
            p1++;
        }
        while (p2 < t) {
            answer.add(arr2[p2]);
            p2++;
        }

        for(Integer x : answer) System.out.print(x + " ");
    }
}
