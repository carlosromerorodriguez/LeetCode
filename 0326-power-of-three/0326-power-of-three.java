class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        double res = Math.log(n) / Math.log(3);
        return Math.abs(res - Math.round(res)) < 1e-10;
    }
}