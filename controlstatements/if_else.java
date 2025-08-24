import java.util.Scanner;

public class if_else {
     public static void main(String[] args){

     System.out.print("Enter the any number:-");
     Scanner sc=new Scanner(System.in);
     int input =sc.nextInt();
     for(int i=0;i<input;i++){
          if (i%2==0){ 
            System.out.println("Even_numbers are "+i);
           }else{ 
             System.out.println("Odd_numbers are "+i);

            }
        }
     
     



     }









}