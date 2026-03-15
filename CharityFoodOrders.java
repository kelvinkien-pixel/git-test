import java.util.Scanner;
import java.util.Random;
public class CharityFoodOrders // The name of this program
{ 
    public static void main(String[] args)
    {
      Scanner scnr = new Scanner(System.in); 
      int numPeople, numMeals;
      double costPerBag, percent;

      numPeople = scnr.nextInt();
      numMeals = scnr.nextInt();
      costPerBag = scnr.nextDouble();
      String format = "%.2f";

      System.out.println("Number of people:");
      System.out.println("Number of meals per person:");
      System.out.println("Cost per bag of rice:");
      System.out.println("");

      System.out.print("This order will support ");
      System.out.printf("%,d",numPeople);
      System.out.println(" people to each make " + numMeals + " rice based meals.");
      int allMeals = numPeople * numMeals;
      System.out.print("Total meals: ");
      System.out.printf("%,d\n",allMeals);
      int bags = (int) Math.ceil((double) allMeals / 12);
      double totalCost =  bags * costPerBag;
      System.out.print("You will need ");
      System.out.print(bags);
      System.out.print(" bags of rice for a cost of $");
      System.out.printf("%,.2f", totalCost);
      System.out.println(".");
      System.out.println("");

      System.out.println("Please input the expected percentage of late orders:");
      percent = scnr.nextDouble(); 
      System.out.println("");
      
      double numBags;
      numBags = (bags + bags * percent); 
      numBags = Math.round(numBags);
      totalCost = numBags * costPerBag;
      System.out.print("Allowing for late orders, you should order: ");
      System.out.printf("%.0f",numBags);
      System.out.print(" bags of rice for a cost of $");
      System.out.printf("%,.2f",totalCost);
      System.out.print(".");
    }
}
