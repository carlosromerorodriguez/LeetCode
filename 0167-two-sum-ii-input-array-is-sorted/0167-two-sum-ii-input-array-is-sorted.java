import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> helpers = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (helpers.containsKey(numbers[i])) {
                return new int[] {helpers.get(numbers[i]), i + 1};
            }
            helpers.put(target - numbers[i], i + 1);
        }

        return new int[0];
    }
}