import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    private static final HashMap<Character, String> map = new HashMap<>();

    static {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return res;
        }

        char[] config = new char[digits.length()];
        backTracking(digits, config, 0, res);
        return res;
    }

    private void backTracking(String digits, char[] config, int lvl, List<String> res) {
        if (lvl == digits.length()) {
            res.add(new String(config));
            return;
        }

        char[] newLetters = map.get(digits.charAt(lvl)).toCharArray();

        for (char c : newLetters) {
            config[lvl] = c;
            backTracking(digits, config, lvl + 1, res);
        }
    }
}