import java.util.Scanner;

public class Polidrome_String {

    public static boolean Check_Polidrome(String name) {
        // Optional: normalize string (ignore case and spaces)
        name = name.replaceAll("\\s+", "").toLowerCase();

        int length = name.length();
        for (int i = 0; i < length; i++) {
            if (name.charAt(i) != name.charAt(length - i - 1)) {
                return false; // mismatch found
            }
        }
        return true; // all matched
    }

    public static void main(String[] args) {
        System.out.print("Enter any String:-");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (Check_Polidrome(input)) {
            System.out.println("It is a palindrome!");
        } else {
            System.out.println("It is not a palindrome!");
        }
    }
}
