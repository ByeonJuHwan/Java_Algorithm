package 가위바위보;

import java.util.Scanner;

public class Byeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 횟수 입력받고 for문
        int n = sc.nextInt();
        // A가 낸 숫자 배열로 입력받기
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        // B가 낸 숫자 배열로 입력받기
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        // if문으로 출력
        for (int i = 0; i < n; i++) {
            if (A[i] == B[i]) {
                System.out.println("D");
            } else if (A[i]==1) {
                if (B[i] == 2) {
                    System.out.println("B");
                } else if (B[i]==3) {
                    System.out.println("A");
                }
            } else if (A[i]==2) {
                if (B[i] == 1) {
                    System.out.println("A");
                } else if (B[i] == 3) {
                    System.out.println("B");
                }
            } else if (A[i]==3) {
                if (B[i] == 1) {
                    System.out.println("B");
                } else if (B[i] == 2) {
                    System.out.println("A");
                }
            }
        }
    }
}

