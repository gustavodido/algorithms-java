package basic;

public class Palindrome {
    boolean isPalindrome(String s1) {
        // Just test the N/2 first chars with the latest N/2 chars...
        for (int i = 0; i < s1.length() / 2; i++) {
            if (s1.charAt(i) != s1.charAt(s1.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
