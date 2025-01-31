public class Main {
    public static void main(String[] args) {
        PalindromeChecker sim = new PalindromeChecker();
        sim.tester();
    }
}

class PalindromeChecker {
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return s.equals(reverse(s));
    }

    public void tester() {
        checkPalindrome("test");
        checkPalindrome("rotator");
        checkPalindrome("rewriter");
        checkPalindrome("nurses run");
        checkPalindrome("Madam, I'm Adam!");
        checkPalindrome("A Man! A Plan! A Canal! Panama!");
    }

    public void checkPalindrome(String s) {
        System.out.println(s + (isPalindrome(s) ? " is a palindrome." : " is NOT a palindrome."));
    }
}
