public class Main {

    static public boolean isPalindrome(String s) {

        String a = s.toLowerCase();
        a = a.trim();
        StringBuilder deleter = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if ((c >= 97 && c <= 122) || (c >= 48 && c <= 57)) {
                deleter.append(c);
            }
        }
        a = deleter.toString();
        StringBuilder reverseA = new StringBuilder(a);
        String reversed = reverseA.reverse().toString();
        if (a.equals(reversed)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("aka"));
    }
}