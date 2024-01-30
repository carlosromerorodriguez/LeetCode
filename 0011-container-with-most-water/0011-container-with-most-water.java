class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int leftPointer = 0, rightPointer = height.length - 1;

        while (leftPointer < rightPointer) {
            int currentArea = Math.abs(leftPointer - rightPointer) * Math.min(height[leftPointer], height[rightPointer]);
            max = Math.max(max, currentArea);
            if (height[leftPointer] <= height[rightPointer]) {
                leftPointer++;
            } else if (height[leftPointer] > height[rightPointer]) {
                rightPointer--;
            } else {
                leftPointer++;
                rightPointer--;
            }
        }

        return max;
    }
}