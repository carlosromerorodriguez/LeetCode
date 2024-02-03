import java.util.HashSet;

class RandomizedSet {
    private static HashSet<Integer> randomizedSet;
    public RandomizedSet() {
        randomizedSet = new HashSet<>();
    }

    public boolean insert(int val) {
        return randomizedSet.add(val);
    }

    public boolean remove(int val) {
        return randomizedSet.remove(val);
    }

    public int getRandom() {
        Object[] numbers = randomizedSet.toArray();
        int index = (int) (Math.random() * randomizedSet.size());
        return (int) numbers[index];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */