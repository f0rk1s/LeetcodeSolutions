import java.util.HashMap;

class Main {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> numberExists = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numberExists.get(nums[i]) > 0) {
                return true;
            }
            numberExists.put(nums[i], 1);
        }
        return false;
    }
}