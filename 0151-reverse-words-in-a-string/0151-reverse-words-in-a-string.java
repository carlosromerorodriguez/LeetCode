class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] split = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if (!split[split.length - 1 - i].isEmpty())
                res.append(split[split.length - 1 - i].trim()).append(i + 1 == split.length ? "" : " ");
        }

        return res.toString();
    }
}