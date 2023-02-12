package HashMapTreeSet.모든아나그램찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Byeon {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] S = bf.readLine().toCharArray();
        char[] T = bf.readLine().toCharArray();
        int answer = 0;

        // T문자열의 값들을 map에 저장
        Map<Character, Integer> Tmap = new HashMap<>();
        for (int i = 0; i < T.length; i++) {
            Tmap.put(T[i], Tmap.getOrDefault(T[i], 0) + 1);
        }

        // 슬라이딩 윈도우 시작
        // 일단 한번 돌기
        Map<Character, Integer> Smap = new HashMap<>();
        for (int i = 0; i < T.length; i++) {
            Smap.put(S[i], Smap.getOrDefault(S[i], 0) + 1);
        }

        // 두개의 map이 같은지 확인.
        // equals를 사용하면 키값이 전부 같은지 value값이 전부 같은지도 확인해준다.
        if(Smap.equals(Tmap)) answer++;

        // 이제 부터 rt와 lt 무빙시작
        int lt = 0;
        for (int rt = T.length; rt < S.length; rt++) {
            // lt먼저 빼고 시작
            if (Smap.get(S[lt]) == 1) {
                Smap.remove(S[lt]);
            }else{
                Smap.put(S[lt], Smap.get(S[lt]) - 1);
            }
            lt++;
            // rt 넣기 시작
            Smap.put(S[rt], Smap.getOrDefault(S[rt], 0) + 1);

            // 변경된 Smap 과 Tmap이 같은지 확인 같으면 answer 증가
            if(Smap.equals(Tmap)) answer++;
        }

        System.out.println(answer);
        bf.close();
    }
}
