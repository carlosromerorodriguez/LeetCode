class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
            sb.append((i < word1.length()) ? word1.charAt(i) : "").append(i < word2.length() ? word2.charAt(i) : "");
        }

        return sb.toString();
    }
}