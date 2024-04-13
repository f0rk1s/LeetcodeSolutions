public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (m == 0) {
            nums1[0] = nums2[0];
        }
        int i = m - 1;
        int k = n - 1;
        for (int j = m + n - 1; j > 0; j--) {
            if (nums2[k] >= nums1[i]) {
                nums1[j] = nums2[k];
                k--;
            }
            else {
                nums1[j] = nums1[i];
                i--;
            }

        }
    }
}
