class Solution {
    public int lengthOfLongestSubstring(String s) {
        int startPointer = 0, endPointer = 0, best = 0;
        HashSet<Character> currentSubstring = new HashSet<>();

        while (endPointer != (s.length())) {
            if (!currentSubstring.contains(s.charAt(endPointer))) {
                currentSubstring.add(s.charAt(endPointer));
                endPointer++;
                best = Math.max(best, currentSubstring.size());
            } else {
                currentSubstring.remove(s.charAt(startPointer));
                startPointer++;
            }
        }
        return best;
    }
}