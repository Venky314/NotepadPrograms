import java.util.Scanner;

public class practice_reverse_string{

    public static void main(String[] args){
        System.out.print("Enter the any string:-");
        Scanner sc =new Scanner(System.in);
        String name =sc.nextLine();
        int Length=name.length();
        
        String revString ="";
        
       for (int i=0;i<Length;i++){
           revString += name.charAt(Length-1-i);
          
         
        }
     System.out.print("the reverse string:-"+revString); 
         

 
    }







}