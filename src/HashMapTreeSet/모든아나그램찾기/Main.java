package HashMapTreeSet.모든아나그램찾기;

import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.print(T.solution(a, b));
    }

    private int solution(String a, String b) {
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        // 미리 b는 세팅해야함
        for (char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0) + 1);

        // b의 길이 1개 전만큼 am을 세팅해놓고 rt 돌기 시작 즉 2번째까지만 넣어놓고 3번째부터 rt가 돌기 시작
        int L = b.length() - 1;
        for (int i = 0; i < L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);

        int lt = 0;
        for (int rt = L; rt < a.length(); rt++) {
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);

            // 두 개의 map이 같은지 확인
            if(am.equals(bm)) answer++;

            // lt 앞으로 딩기기
            am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
            if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
            lt++;
        }
        return answer;
    }
}
