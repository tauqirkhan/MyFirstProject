import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //Weight Conversion Program

        int choice;
        double weight;
        double newWeight;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight Conversion Program");
        System.out.println("Option 1: Convert lbs to kgs");
        System.out.println("Option 2: Covert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f kgs", newWeight);
        } else if(choice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f lbs", newWeight);
        } else{
            System.out.println("You had selected wrong option");
        }

        scanner.close();
    }
}