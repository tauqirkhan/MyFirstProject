import java.util.Random;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        // ROCK PAPER SCISSORS GAME

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        int[][] yourWinningChoices = {
                {0, 2},
                {1, 0},
                {2, 1},
        };
        char playAgain = 'n';

        System.out.println("*************************");
        System.out.println("Rock, Paper, Scissor Game");
        System.out.println("*************************");

        do{
            System.out.print("Enter the your choice? (rock, paper, scissor) ");
            playerChoice = scanner.nextLine().toLowerCase();

            computerChoice = choices[random.nextInt(3)];
            System.out.printf("Computer Choice is %s. \n", computerChoice);

            if(computerChoice.equals(playerChoice)){
                System.out.println("It's a tie!");
                playAgain = 'n';
            } else if (
                    (playerChoice.equals(choices[yourWinningChoices[0][0]]) && computerChoice.equals(choices[yourWinningChoices[0][1]])) ||
                            (playerChoice.equals(choices[yourWinningChoices[1][0]]) && computerChoice.equals(choices[yourWinningChoices[1][1]])) ||
                            (playerChoice.equals(choices[yourWinningChoices[2][0]]) && computerChoice.equals(choices[yourWinningChoices[2][1]]))
            ) {
                System.out.println("*********");
                System.out.println("You Won!!!");
                System.out.println("*********");
                playAgain = 'n';
            } else{
                if(!playerChoice.equals(choices[0]) && !playerChoice.equals(choices[1]) && !playerChoice.equals(choices[2])){
                    System.out.println("Invalid choice!");
                    playAgain = 'y';
                    continue;
                } else {
                    System.out.println("*********");
                    System.out.println("You Lost!!!");
                    System.out.println("*********");
                    playAgain = 'n';
                }
            }

            System.out.print("Want to play again? (y/n)");
             if(Character.toLowerCase(scanner.next().charAt(0)) == 'y'){
                 playAgain = 'y';
             } else {
                 playAgain = 'n';
             };

            //To clear buffer created from scanner.next()
             scanner.nextLine();
        }while (playAgain == 'y');

        System.out.println("*****************");
        System.out.println("Thanks For Playing!!!");
        System.out.println("*****************");
    }
}