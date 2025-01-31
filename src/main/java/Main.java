public class PalindromeChecker {
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return s.equals(reverse(s));
    }

    public static void main(String[] args) {
        testPalindrome("test");
        testPalindrome("rotator");
        testPalindrome("rewriter");
        testPalindrome("nurses run");
        testPalindrome("Madam, I'm Adam!");
        testPalindrome("A Man! A Plan! A Canal! Panama!");
    }

    public static void testPalindrome(String s) {
        System.out.println(s + " -> " + (isPalindrome(s) ? "Palindrome" : "Not a palindrome"));
    }
}
