class Solution {
    public static int strStr(String haystack, String needle) {

        if (haystack == null && needle == null) {
            return -1;
        }
        int N = haystack.length();
        int N2 = needle.length();
        for (int i = 0; i < N; i++) {
            int j = 0;
            int k = i;
            char c = needle.charAt(j);
            char c1 = haystack.charAt(i);
            while (c == c1) {
                j++;
                k++;
                if (j == N2) {
                    return k - N2;
                }
                c = needle.charAt(j);
                if (k == N) {
                    return -1;
                }
                c1 = haystack.charAt(k);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi","issip"));
    }
}