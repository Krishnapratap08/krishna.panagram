import java.util.Scanner;

public class PangramCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        if (isPangram(input)) {
            System.out.println("The input string is a pangram.");
        } else {
            System.out.println("The input string is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        // Create a boolean array of size 26 (for each alphabet)
        boolean[] mark = new boolean[26];

        // Traverse the string and mark the presence of each alphabet
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // If the character is an alphabet, mark it
            if (ch >= 'a' && ch <= 'z') {
                mark[ch - 'a'] = true;
            }
        }

        // Check if any alphabet is not marked (i.e., missing in the string)
        for (boolean value : mark) {
            if (!value) {
                return false;  // If any alphabet is not marked, return false
            }
        }
        return true;  // If all alphabets are marked, return true
    }
}