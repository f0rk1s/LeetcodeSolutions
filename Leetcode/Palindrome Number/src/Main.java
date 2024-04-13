public class Main {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
        String s = Integer.toString(x);
        int a = s.length() - 1;
        if (a == -1) {
            return false;
        }
        else if (a == 0) {
            return true;
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(a - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Main m = new Main();

        System.out.println(m.isPalindrome(123454321));
    }
}
