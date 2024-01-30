class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length <= 1) {
            return (strs.length == 1) ? strs[0] : "";
        }

        String res = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String toCompare = strs[i];
            StringBuilder newCommonString = new StringBuilder();
            for (int j = 0; j < Math.min(res.length(), toCompare.length()); j++) {
                if (res.charAt(j) == toCompare.charAt(j)) {
                    newCommonString.append(res.charAt(j));
                } else {
                    break;
                }
            }
            res = newCommonString.toString();
        }

        return res;
    }
}