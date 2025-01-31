import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PalindromeChecker {
    public void tester() {
        String[] lines = new String[6];
        try {
            File myFile = new File("palindromes.txt");
            Scanner myReader = new Scanner(myFile);
            int counter = 0;
            while (myReader.hasNextLine()) {
                lines[counter] = myReader.nextLine();
                counter++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return;
        }

        System.out.println("there are " + lines.length + " lines");
        for (String line : lines) {
            if (palindrome(line)) {
                System.out.println(line + " IS a palindrome.");
            } else {
                System.out.println(line + " is NOT a palindrome.");
            }
        }
    }

    public boolean palindrome(String word) {
        String cleaned = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return cleaned.equals(reverse(cleaned));
    }

    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        new PalindromeChecker().tester();
    }
}
