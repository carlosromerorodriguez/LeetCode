class Solution {
    public int countPrimeSetBits(int left, int right) {
        int counter = 0;

        for (int i = left; i <= right; i++) {
            if (isPrime(Integer.toBinaryString(i).replace("0", "").length())) {
                counter++;
            }
        }

        return counter;
    }

    private boolean isPrime(int number) {
        if (number < 2) return false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}