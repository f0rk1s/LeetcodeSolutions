class Solution {
    public static int[] plusOne(int[] digits) {

        int N = digits.length;
        if (digits[N - 1] != 9) {
            digits[N - 1]++;
        }
        else {
            int n = N - 1;
            while (n >= 0 && digits[n] == 9) {
                digits[n] = 0;
                n--;
            }
            if (n < 0) {
                int[] ans = new int[N + 1];
                ans[0] = 1;
                for (int i = 1; i < ans.length; i++) {
                    ans[i] = 0;
                }
                return ans;
            }
            digits[n]++;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] arr = {9,9,9};

        for (int n: plusOne(arr)) {
            System.out.print(n);
        }

    }
}