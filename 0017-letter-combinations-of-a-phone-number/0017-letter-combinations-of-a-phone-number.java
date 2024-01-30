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

        char[] config = new char[digits.toCharArray().length];
        backTracking(digits, res, config, 0);
        return res;
    }

    private void backTracking(String digits, List<String> res, char[] config, int lvl) {
        if (lvl == digits.length()) {
            res.add(new String(config));
            return;
        }

        char digit = digits.charAt(lvl);
        String letters = map.get(digit);
        for (char letter : letters.toCharArray()) {
            config[lvl] = letter;
            backTracking(digits, res, config, lvl + 1);
        }
    }
}