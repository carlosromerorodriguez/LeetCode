import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int leftPointer = i + 1, rightPointer = nums.length - 1, sum = -nums[i];
                while (leftPointer < rightPointer) {
                    if (nums[leftPointer] + nums[rightPointer] == sum) {
                        res.add(Arrays.asList(nums[i], nums[leftPointer], nums[rightPointer]));
                        while (leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer + 1]) leftPointer++; // Saltar duplicados.
                        while (leftPointer < rightPointer && nums[rightPointer] == nums[rightPointer - 1]) rightPointer--; // Saltar duplicados.
                        leftPointer++;
                        rightPointer--;
                    } else if (nums[leftPointer] + nums[rightPointer] < sum) {
                        leftPointer++;
                    } else {
                        rightPointer--;
                    }
                }
            }
        }
        return res;
    }
}