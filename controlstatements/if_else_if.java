import java.util.Scanner;

public class if_else_if{

     public static void main(String[] args){
     System.out.print("Enter the any number:-");
     Scanner sc =new Scanner(System.in);
     try{
        int a =sc.nextInt();
        for (int i=0;i<a;i++){
            if (i<=5){
              System.out.println("First class");
            }else if ((i>5) && (i<10)){
              System.out.println("Second class");
            }else{
              System.out.println("Third class");
            }

        }



      }catch(Exception e){
        System.out.println("the error occured:-"+ e.getMessage());     

      }
     



     }










}