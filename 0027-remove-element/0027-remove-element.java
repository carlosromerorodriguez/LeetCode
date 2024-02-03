import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> notEqual = new ArrayList<>();

        for (int num : nums) {
            if (num != val) {
                notEqual.add(num);
            }
        }

        Arrays.fill(nums, -1);
        for (int i = 0; i < notEqual.size(); i++) {
            nums[i] = notEqual.get(i);
        }

        return notEqual.size();
    }
}