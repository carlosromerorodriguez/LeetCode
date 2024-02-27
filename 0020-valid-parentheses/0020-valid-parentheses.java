import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;

class Solution {
    static HashMap<Character, Character> map = new HashMap<>();

    static {
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
    }
    public boolean isValid(String s) {
        if (s.length() < 2 || s.isBlank()) return false;

        Stack<Character> openings = new Stack<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                openings.push(c);
            } else {
                if (openings.isEmpty()) return false;
                if (map.get(openings.pop()) != c) {
                    return false;
                }
            }
        }

        return openings.isEmpty();
    }
}