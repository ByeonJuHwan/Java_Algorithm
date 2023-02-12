package HashMapTreeSet.매출액의종류;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Byeon {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;
        int[] arr = new int[n];
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 슬라이딩 윈도우랑 맵을 같이사용
        // 정답은 List에 담아서 출력
        List<Integer> answer = new ArrayList<>();
        // 일단 한번 돌기 1일차
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Integer x : map.keySet()) {
            count++;
        }
        answer.add(count);

        // 이제 부터 슬라이딩 윈도우 시작
        int lt = 0;
        for (int rt = k; rt < n; rt++) {
            // lt 값을 먼저 줄이고 카운트가 더 유리해보임
            // lt값이 0이면 맵에서 지워서 종류 다운
            if(map.get(arr[lt])==1){
                map.remove(arr[lt]);
                count--;
            }else{
                map.put(arr[lt], map.get(arr[lt]) - 1);
            }
            lt++;
            // 위와 동일하게 키값이 있으면 증가 없으면 map에 추가후 count ++
            if (map.containsKey(arr[rt])) {
                map.put(arr[rt], map.get(arr[rt]) + 1);
            }else{
                map.put(arr[rt], 1);
                count++;
            }
            answer.add(count);
        }
        for (Integer x : answer) {
            System.out.print(x + " ");
        }
        bf.close();
    }
}
