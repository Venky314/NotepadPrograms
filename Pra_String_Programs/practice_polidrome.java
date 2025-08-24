import java.util.Scanner;

public class practice_polidrome{
     public static  boolean is_palindrome (String name){
          
          String updated_string = name.replaceAll("\\s+", "");

          int Length=updated_string.length();

           for (int i=0;i<Length;i++){
              if (updated_string.charAt(i) != updated_string.charAt(Length - 1 - i)){
               return false;
             }


            }
            return true;


      }

    public static void main(String[] args){
         
         System.out.print("Enter a word:-");
         Scanner sc=new Scanner(System.in);
         String  word =sc.nextLine();
         if (is_palindrome(word)) {
            System.out.println("Palindrome ✅");
         }else{
             System.out.println("Not a palindrome ❌");
          }
         





    }

}