import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int hIndex(int[] citations) {
        Integer[] citationsObj = new Integer[citations.length];
        for (int i = 0; i < citations.length; i++) {
            citationsObj[i] = citations[i];
        }

        Arrays.sort(citationsObj, Collections.reverseOrder());

        int hIndex = 0;
        for (int i = 0; i < citationsObj.length; i++) {
            if (citationsObj[i] >= i + 1) {
                hIndex = i + 1;
            } else {
                break;
            }
        }

        return hIndex;
    }
}