import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        // Compound interest formula
        // amount = p * Math.pow(1 + r / t, t * y);

        Scanner scanner = new Scanner(System.in);

        double amount;
        double principle;
        double rate;
        double timesCompounded;
        int years;

        System.out.print("Enter the principle amount: ");
        principle = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        // In percentage
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # times compounded per year: ");
        timesCompounded = scanner.nextDouble();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is $%.2f", years, amount);

        scanner.close();

    }
}