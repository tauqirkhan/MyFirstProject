import java.util.Scanner;

public class Main{

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        double balance = 0;
        boolean isRunning = true;
        int choice;
        boolean shownOption = true;

        while(isRunning){
            if(shownOption){
                System.out.println("***************");
                System.out.println("BANKING PROGRAM");
                System.out.println("***************");
                System.out.println("1. Show Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.println("***************");
            }

            shownOption = false;
            System.out.print("Enter your choice (1 - 4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid input");
            }
        }

        System.out.println("***************************");
        System.out.println("Thank you! Have a nice day!");
        System.out.println("***************************");
    }

    static void showBalance(double balance){
        System.out.println("***************************");
        System.out.printf("Your current balance is $%.2f\n", balance);
        System.out.println("***************************");
    }

    static double deposit(){
        double deposit;

        System.out.print("Enter the deposit amount: ");
        deposit = scanner.nextDouble();

        return deposit;
    }

    static double withdraw(double balance){
        double amount = 0;

        System.out.print("Enter the amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("You cannot withdraw, greater then balance");
            return 0;
        } else if(amount < 0){
            System.out.println("Withdrawn amount cannot be negative");
            return  0;
        } else {
            return amount;
        }
    }
}