package 투포인터_슬라이딩윈도우.연속된자연수의합;

import java.util.Scanner;

public class Another {
    public static void main(String[] args) {
        Another T = new Another();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }

    private int solution(int n) {
        int answer = 0, cnt =1;
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if(n % cnt == 0) answer++;
        }
        return answer;
    }
}
