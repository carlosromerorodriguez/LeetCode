class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty() || s.isBlank()) return true;

        int sIndex = 0, tIndex = 0;

        while (tIndex < t.length()) {
            if(t.charAt(tIndex) == s.charAt(sIndex)) sIndex++;
            if (sIndex == s.length()) return true;
            tIndex++;
        }

        return false;
    }
}