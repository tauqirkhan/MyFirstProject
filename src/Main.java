import java.util.Random;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        // CANDY SLOT MACHINE

        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String[] options = {"🍬", "🍭", "🍫", "🫕", "🍪"} ;
        char playAgain = 'y';

        System.out.println("****************************************************************");
        System.out.println("  Welcome To Candy Slot Machine, Where You'll Risk Your Candy.  ");
        System.out.println("Symbols: 🍬 | 🍭 | 🍫 | 🫕 | 🍪 ");
        System.out.println("****************************************************************");

        while (playAgain == 'y'){
            if(balance > 0){

                System.out.print("Enter bet amount of candies: ");
                bet = scanner.nextInt();

                if(bet > balance){
                    System.out.printf("Your current candies balance are %d,\nAmount can't be more than candies balance\n", balance);
                    //skip
                    continue;
                }
                if(bet <= 0){
                    System.out.println("Candy bet amount can't be negative or 0");
                    //skip
                    continue;
                }

                balance -= bet;

                System.out.println("Spinning...");
                row = spinRow(options);

                for(String symbol: row){
                    System.out.println(symbol);
                }

                payout = getPayoutAmount(row, bet);
                if(payout > 0){
                    System.out.printf("You won %d candies!\n", payout);
                    balance += payout;
                } else{
                    System.out.printf("You lost %d candies\n", bet);
                }

                System.out.printf("Your current candy amount is %d\n", balance);
            }
            // ASK TO PLAY AGAIN
            System.out.print("Do you want to play again? (y/n)");
            playAgain = Character.toLowerCase(scanner.next().charAt(0));
        }

        System.out.println("*****************");
        System.out.println("Thanks For Playing!");
        System.out.println("*****************");
    }

    static int getPayoutAmount(String[] row, int bet){
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍬" -> bet * 4;
                case "🍭" -> bet * 6;
                case "🍫" -> bet * 8;
                case "🫕" -> bet * 10;
                case "🍪" -> bet * 20;
                default -> 0;
            };
        } else if(row[0].equals(row[1])){
            return switch(row[1]){
                case "🍬" -> bet * 2;
                case "🍭" -> bet * 3;
                case "🍫" -> bet * 4;
                case "🫕" -> bet * 5;
                case "🍪" -> bet * 10;
                default -> 0;
            };
        } else if (row[1].equals(row[2])){
            return switch(row[0]){
                case "🍬" -> bet * 2;
                case "🍭" -> bet * 3;
                case "🍫" -> bet * 4;
                case "🫕" -> bet * 5;
                case "🍪" -> bet * 10;
                default -> 0;
            };
        }else if (row[0].equals(row[2])) {
            return switch (row[0]) {
                case "🍬" -> bet * 2;
                case "🍭" -> bet * 3;
                case "🍫" -> bet * 4;
                case "🫕" -> bet * 5;
                case "🍪" -> bet * 10;
                default -> 0;
            };
        } else {
            return 0;
        }
    }

    static String[] spinRow(String[] options){
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < 3; i++){
              row[i] = options[random.nextInt(options.length)];
        }

        return  row;
    }
}