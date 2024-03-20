class Solution {
    public boolean hasAlternatingBits(int n) {
        if (n <= 2) return true;

        StringBuilder sb = new StringBuilder().append(Integer.toBinaryString(n));
        char even = sb.charAt(0), odd = (sb.charAt(0) == '0') ? '1' : '0';

        for (int i = 0; i < sb.length(); i++) {
            if ((i % 2 == 0 && sb.charAt(i) != even) ||
                (i % 2 == 1 && sb.charAt(i) != odd))
                return false;
        }

        return true;
    }
}