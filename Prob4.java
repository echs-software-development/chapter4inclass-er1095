import java.util.Scanner;

public class Prob4 {
  public static void main(String[] args) {
   Scanner scan = new Scanner (System.in);
   System.out.println("Enter two characters");
   String s = scan.nextLine();

   if (s.charAt(0) == 'M'){
     System.out.println("Mathematics");
   }

   else if (s.charAt(0) == 'C'){
     System.out.println("Computer Science");
   }

   else if (s.charAt(0) == 'I'){
     System.out.println("Information Technolgy");
   }

   else{
    System.out.println("input invalid");
   }
   
 
   if (s.charAt(1) == '1'){
    System.out.println("freshman");
   }

   else if (s.charAt(1) == '2'){
    System.out.println("sophmore");
   }

   else if (s.charAt(1) == '3'){
    System.out.println("junior");
   }

   else if (s.charAt(1) == '4'){
    System.out.println("senior");
   }

   else {
    System.out.println("input invalid");
   }
  }
}