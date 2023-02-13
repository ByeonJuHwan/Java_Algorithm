package stackqueue.크레인인형뽑기;

import java.util.Scanner;
import java.util.Stack;

public class Byeon {
    public static void main(String[] args) {
        // 입력 :
        // 5
        // 0 0 0 0 0
        // 0 0 1 0 3
        // 0 2 5 0 1
        // 4 2 4 4 2
        // 3 5 1 3 1
        // 8
        // 1 5 3 5 1 2 1 4
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>(); // 바구니
        int answer = 0;
        // 세팅 끝

        for (int x = 0; x < moves.length; x++) {
            for (int i = 0; i < n; i++) {
                if (board[i][moves[x]-1] != 0){
                    if (!stack.isEmpty()) {
                        if (stack.peek() == board[i][moves[x]-1]) {
                            stack.pop();
                            answer++;
                        }else {
                            stack.push(board[i][moves[x]-1]);
                        }
                    }else{
                        stack.push(board[i][moves[x]-1]);
                    }
                    board[i][moves[x]-1] = 0;
                    break;
                }
            }
        }
        System.out.println(answer*2);
    }
}
