package Array.뒤집은소수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Byeon {
    public static void main(String[] args) {
         // 입력받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // for 문으로 받은 자연수를 문자열로 변환 뒤집고 다시 정수로 변환
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String x = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
            Integer y = Integer.parseInt(x);
            list.add(y);
        }
        // 2부터 받은 자연수 까지 나누면서 약수가 있으면 바로 break
        List<Integer> answer = new ArrayList<>();
        for (Integer x : list) {
            if(x==1) continue;
            if(isPrime(x)) System.out.print(x +" ");
        }
    }

    private static boolean isPrime(Integer x) {
        for (int i = 2; i < (x / 2) + 1; i++) {
            if(x%i==0) return false;
        }
        return true;
    }
}
