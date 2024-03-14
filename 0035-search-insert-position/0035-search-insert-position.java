class Solution {
    public int searchInsert(int[] nums, int target) {
        int leftPtr = 0, rightPtr = nums.length - 1;
        
        while(leftPtr <= rightPtr) {
            int midPtr = leftPtr + (rightPtr - leftPtr) / 2;
            
            if (nums[midPtr] == target) {
                return midPtr;
            } else if (nums[midPtr] < target) {
                leftPtr = midPtr + 1;
            } else {
                rightPtr = midPtr - 1;
            }
        }
        
        return leftPtr;
    }
}