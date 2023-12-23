class Solution {
    public int reverse(int x) {
        if (x < 0) {
            x *= -1;
            return (reverseHelper(x) * -1);
        }
        return reverseHelper(x);
    }

    private int reverseHelper(int x) {
        long res = 0;
        while(x != 0){
            int lastDigit = x % 10;
            res = (res * 10) + lastDigit;
            x = x / 10;
        }

        return (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) ? 0 : (int) res;
    }
}