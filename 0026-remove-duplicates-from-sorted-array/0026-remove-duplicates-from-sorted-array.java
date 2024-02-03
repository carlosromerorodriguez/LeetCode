import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int num : nums) {
            uniqueNumbers.add(num);
        }

        Object[] array = uniqueNumbers.toArray();
        Arrays.sort(array);

        Arrays.fill(nums, -1);
        for (int i = 0; i < array.length; i++) {
            nums[i] = (int) array[i];
        }

        return array.length;
    }
}