package DFSBFS기초.재귀함수;

public class Main {
    // 재귀함수는 이제부터 DFS로 표현
    public void DFS(int n) {
        // 재귀함수는 일단 무조건 If-else문으로
        if (n == 0) return;
        else{
            // 재귀함수는 스택 프레임으로
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args){
        Main T = new Main();
        T.DFS(3);
    }
}
