import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> numbers = new HashMap<>(); // 1, 4 ocurrences
                                                             // 0, 2 ocurrences
        for (int num : nums) {
            numbers.merge(num, 1, Integer::sum);
        }

        int numsPos = 0;
        Arrays.fill(nums, Integer.MAX_VALUE);
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            int solutionNum = entry.getKey();
            int occurrences = entry.getValue() > 2 ? 2 : entry.getValue();
            for (int j = 0; j < occurrences; j++) {
                nums[numsPos++] = solutionNum;
            }
        }
        Arrays.sort(nums);

        return numsPos;
    }
}