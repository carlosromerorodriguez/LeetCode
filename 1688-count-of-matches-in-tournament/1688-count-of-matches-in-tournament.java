class Solution {
    public int numberOfMatches(int n) {
        int nTeams = (n % 2 == 0) ? (n / 2) : (n - 1) / 2;

        return n - 1;
    }
}