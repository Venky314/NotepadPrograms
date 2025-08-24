import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class seperate_elements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();

        // remove spaces
        String revstring = name.replaceAll("\\s+", "");
        int length_string = revstring.length();

        // to build separated string
        String empty_string = "";

        // store character frequencies
        HashMap<Character, Integer> test = new HashMap<>();

        for (int i = 0; i < length_string; i++) {
            char ch = revstring.charAt(i);

            // update count in HashMap
            test.put(ch, test.getOrDefault(ch, 0) + 1);
        }

        // print separated characters
        System.out.println("Separated elements: " + empty_string);

        // print frequency of each character
        System.out.println("Character Frequencies: " + test);
    }
}
