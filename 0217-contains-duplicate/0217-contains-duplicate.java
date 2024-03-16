import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (Integer num : nums) {
            unique.add(num);
        }
        return !(unique.size() == nums.length);
    }
}