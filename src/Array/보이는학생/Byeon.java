package Array.보이는학생;

import java.util.Scanner;

public class Byeon {
    public static void main(String[] args) {
        //8
        //130 135 148 140 145 150 150 153


        // 입력받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int answer = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
                answer++;
            }
        }
        System.out.println(answer);
    }
}
