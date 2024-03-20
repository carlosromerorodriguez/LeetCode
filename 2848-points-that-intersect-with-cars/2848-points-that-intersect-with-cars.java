import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> points = new HashSet<>();

        for (List<Integer> dimension : nums) {
            for (int j = dimension.get(0); j <= dimension.get(1); j++) {
                points.add(j);
            }
        }

        return points.size();
    }
}