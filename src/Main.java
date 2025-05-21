import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        //Number guessing game

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 0;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do{
            System.out.print("Enter a guess: ");
            guess =  scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW! Try again");
            } else if (guess > randomNumber){
                System.out.println("TOO HIGH! Try again");
            } else{
                System.out.printf("Correct! The number was %d\n", guess);
                System.out.printf("# of attempts %d\n",attempts);
            }
        } while(randomNumber != guess);

        scanner.close();
    }
}