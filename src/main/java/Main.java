public class Main {
    public static void main(String[] args) {
        PalindromeChecker sim = new PalindromeChecker();
        sim.tester();
    }
}

class PalindromeChecker {
    public String reverse(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }


    public void tester() {
        String[] tests = {
            "test",
            "rotator",
            "rewriter",
            "nurses run",
            "Madam, I'm Adam!",
            "A Man! A Plan! A Canal! Panama!"
        };

        System.out.println("There are " + tests.length + " lines");

        for (String test : tests) {
            System.out.println(test + (isPalindrome(test) ? " is a palindrome." : " is NOT a palindrome."));
        }
    }
}
