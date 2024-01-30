import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int leftPointer = i + 1, rightPointer = nums.length - 1;
            while (leftPointer < rightPointer) {
                int sum = nums[i] + nums[leftPointer] + nums[rightPointer];
                if (Math.abs(target - sum) < Math.abs(target - res)) {
                    res = sum;
                }
                if (sum < target) {
                    leftPointer++;
                } else {
                    rightPointer--;
                }
            }
        }
        return res;
    }
}