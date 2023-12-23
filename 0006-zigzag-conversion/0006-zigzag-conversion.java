class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)  return s;
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int skip = 2 * (numRows - 1);
            for (int j = i; j < s.length(); j += skip) {
                sb.append(s.charAt(j));
                int currPos = j + skip - 2 * i;
                if (i > 0 && i < numRows - 1 && currPos < s.length()) {
                    sb.append(s.charAt(currPos));
                }
            }
        }

        return sb.toString();
    }
}