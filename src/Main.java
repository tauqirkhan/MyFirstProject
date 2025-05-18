import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // HYPOTENUSE

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("Hypotenuse of side with length " + a + " and " + b + " is " + c + "cm");
    }
}