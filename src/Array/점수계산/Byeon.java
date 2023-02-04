package Array.점수계산;

import java.util.Scanner;

public class Byeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // for문돌면서 앞에꺼랑 같으면 더하기
        int[] answer = new int[n];
        answer[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] == 0) {
                answer[i] = 0;
            }else{
                if (arr[i] == arr[i - 1]) {
                    answer[i] = answer[i - 1] + 1;
                }else{
                    answer[i] = 1;
                }
            }
        }
        int result = 0;
        for (int x : answer) {
            result += x;
        }
        System.out.println(result);
    }
}
