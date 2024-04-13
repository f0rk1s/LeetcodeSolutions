class Solution {
    public int removeElement(int[] nums, int val) {
        int N = nums.length;
        int j = nums.length - 1;
        int counter = 0;
        for (int i = 0; i <= j; i++) {
            if (nums[j] == val) {
                j--;
                counter++;
                i--;
            }
            else if (nums[i] == val) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j--;
                counter++;
            }
        }
        return N - counter;
    }

    //test
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {3,2,2,3};
        System.out.println(s.removeElement(arr, 3));
    }
}