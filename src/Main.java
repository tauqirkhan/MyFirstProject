import java.util.Scanner;

public class Main{
     public static void main(String[] args){

         //Shopping cart program

         String item;
         double price;
         int quantity;
         char currency = '$';
         double total;

         Scanner scanner = new Scanner(System.in);

         System.out.print("What item do you want? :");
         item = scanner.nextLine();

         System.out.print("How many quantity do you want? :");
         quantity = scanner.nextInt();

         System.out.print("What's the price of the " + item + " ? :");
         price = scanner.nextDouble();

         total = price * quantity;

         scanner.close();

         System.out.println("\n You have bought " + quantity + " " + item + "/s");
         System.out.println("Your total is " + currency + total);
     }
}
