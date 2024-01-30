import java.util.LinkedHashMap;

class Solution {
    private static final LinkedHashMap<String, Integer> dictionary = new LinkedHashMap<>();

    static {
        dictionary.put("M", 1000);
        dictionary.put("CM", 900);
        dictionary.put("D", 500);
        dictionary.put("CD", 400);
        dictionary.put("C", 100);
        dictionary.put("XC", 90);
        dictionary.put("L", 50);
        dictionary.put("XL", 40);
        dictionary.put("X", 10);
        dictionary.put("IX", 9);
        dictionary.put("V", 5);
        dictionary.put("IV", 4);
        dictionary.put("I", 1);
    }

    public int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); ) {
            if (i + 1 < s.length() && dictionary.containsKey(s.substring(i, i + 2))) {
                num += dictionary.get(s.substring(i, i + 2));
                i += 2;
            } else {
                num += dictionary.get(s.substring(i, i + 1));
                i++;
            }
        }
        return num;
    }
}