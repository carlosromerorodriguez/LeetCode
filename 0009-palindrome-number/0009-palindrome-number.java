class Solution {
    public boolean isPalindrome(int x) {
        if (x < 10) {
            return x >= 0;
        }
        return x == reverseHelper(x);
    }
    private int reverseHelper(int x) {
        int res = 0;
        while(x != 0){
            int lastDigit = x % 10;
            res = (res * 10) + lastDigit;
            x = x / 10;
        }

        return res;
    }
}