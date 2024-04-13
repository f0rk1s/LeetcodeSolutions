class Solution {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0 || strs == null) { return ""; }
        StringBuilder output = new StringBuilder();
        int charIndex = 0;
        String prefix = strs[0];
        label:
        while (true) {
            char c;
            try {
                c = prefix.charAt(charIndex);
                for (int i = 1; i < strs.length; i++) {
                    if (c != strs[i].charAt(charIndex)) {
                        break label;
                    }
                }
            } catch (Exception e) {
                break label;
            }
            charIndex++;
            output.append(c);
        }
        return output.toString();
    }

    /*
    public String longestCommonPrefix(String[] strs) {

        StringBuilder output = new StringBuilder();

        int charIndex = 0;
        label:
        while (true) {
            char c;
            try {
                c = strs[0].charAt(charIndex);
                for (int i = 1; i < strs.length; i++) {
                    if (c != strs[i].charAt(charIndex)) {
                        break label;
                    }
                }
            } catch (Exception e) {
                break label;
            }
            charIndex++;
            output.append(c);
        }
        return output.toString();
    }
     */
    public static void main(String[] args) {

        Solution s = new Solution();
        String[] strs = {"flower","flow","flight"};
        System.out.println(s.longestCommonPrefix(strs));
    }
}