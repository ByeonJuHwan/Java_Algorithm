package 큰수출력하기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Byeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        // 제일 앞의 인덱스는 무조건 출력
        List<Integer> list = new ArrayList<>();
        list.add(array[0]);
        // 자신의 앞 수보다 큰수만 이므로 배열의 1부터 돌면 된다.
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                list.add(array[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}
