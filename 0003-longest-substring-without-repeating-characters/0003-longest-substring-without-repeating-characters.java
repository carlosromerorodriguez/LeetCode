import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();

        int res = 0;
        int leftPointer = 0, rightPointer = 0;

        while(rightPointer < s.length()) {
            String newStr = s.substring(leftPointer, rightPointer + 1);
            if (uniqueCharacters(newStr)) {
                rightPointer++;
            } else {
                res = Math.max(res, rightPointer - leftPointer);
                leftPointer++;
            }
        }

        return Math.max(res, rightPointer - leftPointer);
    }

    private boolean uniqueCharacters(String newStr) {
        HashMap<Character, Integer> chars = new HashMap<>();

        for (int i = 0; i < newStr.length(); i++) {
            char newChar = newStr.charAt(i);
            if (chars.containsKey(newChar)) {
                return false;
            } else {
                chars.put(newChar, 1);
            }
        }
        return true;
    }
}