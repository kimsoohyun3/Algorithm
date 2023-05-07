import java.util.*;

public class Solution {
    public int solution(int n) {
        String String_n = Integer.toString(n);
        int answer = 0;
        for(int i = 0; i < String_n.length(); i ++) {
            answer += Integer.parseInt(String_n.substring(i, i + 1));
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}