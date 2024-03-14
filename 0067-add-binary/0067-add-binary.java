class Solution {
    public String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            a = addInitialPadding(a, b.length() - a.length());
        } else if (a.length() > b.length()) {
            b = addInitialPadding(b, a.length() - b.length());
        }

        StringBuilder res = new StringBuilder();
        int carry = 0;

        for (int i = a.length() - 1; i >= 0 ; i--) {
            int sum = (a.charAt(i) - '0') + (b.charAt(i) - '0') + carry;
            res.append(sum % 2);
            carry = sum / 2;
        }

        if (carry == 1) {
            res.append(carry);
        }

        return res.reverse().toString();
    }

    private String addInitialPadding(String a, int diff) {
        StringBuilder tmp = new StringBuilder();
        tmp.append("0".repeat(Math.max(0, diff)));
        for (int i = 0; i < a.length(); i++) {
            tmp.append(a.charAt(i));
        }
        return tmp.toString();
    }
}