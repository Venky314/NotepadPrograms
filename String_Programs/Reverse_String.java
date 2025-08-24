import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the any string:-");
        String word = sc.nextLine();

        int Length = word.length();
        String reversed = ""; // empty variable to store reverse

        for (int i = 0; i < Length; i++) {
            reversed += word.charAt(Length - i - 1); // add each char to reversed
        }

        System.out.println("The reverse string:-" + reversed);
    }
}
