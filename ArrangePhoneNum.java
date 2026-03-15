import java.util.Scanner;
public class ProgramSummary{
    public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      long phoneNumber;
      long tempNumber;
      long lastFour;
      long firstFour;
      long prefixNumber;
      
      System.out.println("Please enter the landline phone number:");
      phoneNumber = scnr.nextLong();
      
      tempNumber = phoneNumber;
   
      lastFour = tempNumber % 10000;
      tempNumber = tempNumber / 10000;
      
      firstFour = tempNumber % 10000;
      tempNumber = tempNumber / 10000;
   
      prefixNumber = tempNumber % 10;
      tempNumber   = tempNumber / 10;
   

      System.out.println("Please enter the mobile phone number:");
      System.out.println("");
      System.out.println("Your landline number is: +61" + prefixNumber + " " + firstFour + " " + lastFour);
      phoneNumber = scnr.nextLong();
      
      tempNumber = phoneNumber;
   
      lastFour = tempNumber % 1000;
      tempNumber = tempNumber / 1000;
      
      firstFour = tempNumber % 1000;
      tempNumber = tempNumber / 1000;
   
      prefixNumber = tempNumber;
      tempNumber   = tempNumber / 100;
     
      System.out.println("Your mobile number is: 0" + prefixNumber + " " + firstFour + " " + lastFour);    
    }
}
