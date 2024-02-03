import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer newComplementIdx = complements.get(nums[i]);
            if (newComplementIdx != null) {
                return new int[]{newComplementIdx, i};
            }
            complements.put(target - nums[i], i);
        }

        return nums;
    }
}