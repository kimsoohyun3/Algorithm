import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int[] tangerine) {

        Map<Integer, Integer> sizePerCntMap = new HashMap<>();
        calcSizeCount(tangerine, sizePerCntMap);

        List<Integer> kinds = sizePerCntMap.values().stream().collect(Collectors.toList());

        int kindCount = 0;
        Collections.sort(kinds, Comparator.reverseOrder());

        for (int kind: kinds) {
            k -= kind;
            kindCount++;
            if (k <= 0) {
                break;
            }

        }

        int answer = kindCount;
        return answer;
    }

    public void calcSizeCount(int[] tangerine, Map<Integer, Integer> sizePerCntMap) {

        Arrays.stream(tangerine).forEach(each -> {
            if(sizePerCntMap.containsKey(each)) {
                sizePerCntMap.put(each, sizePerCntMap.get(each)+1);
            } else {
                sizePerCntMap.put(each, 1);
            }
        });

    }
}