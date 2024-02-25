class Solution {
    public int strStr(String haystack, String needle) {
        int index = -1;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.substring(i, Math.min(i + needle.length(), haystack.length())).equals(needle)) {
                index = i;
                break;
            }
        }

        return index;
    }
}