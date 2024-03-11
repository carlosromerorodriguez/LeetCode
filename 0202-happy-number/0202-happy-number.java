import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seenNumbers = new HashSet<>();

        while (true) {
            String s = Integer.toString(n);
            int newNumber = 0;

            for (int i = 0; i < s.length(); i++) {
                newNumber += (int) Math.pow(s.charAt(i) - '0', 2);
            }
            if (newNumber == 1) {
                return true;
            }
            if (seenNumbers.contains(newNumber)) {
                return false;
            }
            seenNumbers.add(newNumber);

            n = newNumber;
            System.out.println("New Number: " + newNumber);
        }
    }
}