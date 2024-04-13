import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[k]){
                nums[++k]=nums[i];
            }
        }

        for (int n : nums) {
            System.out.println(n);
        }
        return k+1;
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        s.removeDuplicates(nums);

    }
}