public class Solution {

     public int romanToInt(String s) {

        int sum = readChar(s.charAt(0));
        char charBefore;
        char charCurr;
        for (int i = 1; i < s.length(); i++) {
            charBefore = (s.charAt(i - 1));
            charCurr = s.charAt(i);
            switch (charBefore) {
                case 'I' -> {
                    if (charCurr == 'V') {
                        sum += 3;
                        continue;
                    } else if (charCurr == 'X') {
                        sum += 8;
                        continue;
                    }
                }
                case 'X' -> {
                    if (charCurr == 'L') {
                        sum += 30;
                        continue;
                    } else if (charCurr == 'C') {
                        sum += 80;
                        continue;
                    }
                }
                case 'C' -> {
                    if (charCurr == 'D') {
                        sum += 300;
                        continue;
                    } else if (charCurr == 'M') {
                        sum += 800;
                        continue;
                    }
                }
            }
            sum += readChar(s.charAt(i));
        }
        return sum;
    }

    public int readChar(char c) {

        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}