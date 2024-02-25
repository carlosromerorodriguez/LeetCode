import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> r = new HashMap<>();
        HashMap<Character, Integer> m = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            r.merge(ransomNote.charAt(i), 1, Integer::sum);
        }

        for (int i = 0; i < magazine.length(); i++) {
            m.merge(magazine.charAt(i), 1, Integer::sum);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            Integer num1 = r.get(ransomNote.charAt(i));
            Integer num2 = m.get(ransomNote.charAt(i));

            if (num2 == null || num1 > num2) return false;
        }

        return true;
    }
}