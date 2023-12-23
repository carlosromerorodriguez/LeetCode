import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        Pattern p = Pattern.compile("^[+-]?(\\d+)");
        Matcher m = p.matcher(s);

        if (m.find()) {
            try {
                return Integer.parseInt(m.group(0));
            } catch (NumberFormatException e) {
                return s.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        return 0;
    }
}