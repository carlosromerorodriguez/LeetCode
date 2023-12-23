class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        /**
         * Manacher's Algorithm (O(n))
         */

        // Modificar la cadena para insertar '#' entre cada caracter
        String t = preprocess(s);
        int n = t.length();
        int[] p = new int[n];
        int c = 0, r = 0;

        for (int i = 1; i < n - 1; i++) {
            int iMirror = 2 * c - i;

            if (r > i) {
                p[i] = Math.min(r - i, p[iMirror]);
            }

            // Expander alrededor de i
            while (t.charAt(i + 1 + p[i]) == t.charAt(i - 1 - p[i])) {
                p[i]++;
            }

            // Reajustar el centro si se ha encontrado un palíndromo más grande
            if (i + p[i] > r) {
                c = i;
                r = i + p[i];
            }
        }

        // Encontrar el palíndromo más largo
        int maxLength = 0;
        int centerIndex = 0;
        for (int i = 1; i < n - 1; i++) {
            if (p[i] > maxLength) {
                maxLength = p[i];
                centerIndex = i;
            }
        }

        int start = (centerIndex - maxLength) / 2; // Eliminar '#' de la posición inicial
        return s.substring(start, start + maxLength);
    }

    private String preprocess(String s) {
        if (s.isEmpty()) {
            return "^$";
        }
        StringBuilder ret = new StringBuilder("^");
        for (int i = 0; i < s.length(); i++) {
            ret.append("#").append(s.charAt(i));
        }
        ret.append("#$");
        return ret.toString();
    }
}