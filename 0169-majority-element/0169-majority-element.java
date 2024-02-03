import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> occurrences = new HashMap<>();

        for (int num : nums) {
            occurrences.merge(num, 1, Integer::sum);
        }

        int maxNum = 0, maxOcurrences = 0;
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() > maxOcurrences) {
                maxOcurrences = entry.getValue();
                maxNum = entry.getKey();
            }
        }

        return maxNum;
    }
}