import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public void rotate(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();

        for (int num : nums) {
            deque.add(num);
        }

        for (int i = 0; i < k; i++) {
            Integer last = deque.getLast();
            deque.addFirst(last);
            deque.removeLast();
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = deque.getFirst();
            deque.removeFirst();
        }
    }
}