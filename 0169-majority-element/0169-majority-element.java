import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0, counter = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (counter == 0) {
                majority = nums[i];
            }
            
            counter += (nums[i] == majority) ? 1 : -1;
        }
        
        return majority;
    }
}