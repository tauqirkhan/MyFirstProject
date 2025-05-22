import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        //JAVA QUIZ GAME

        String[] questions = {
                "What do you call the force that pulls objects towards the Earth?",
                "Which planet is known as the \"Red Planet\"? ",
                "What gas do living creatures need to breathe?",
                "What is the process by which plants make their food? ",
                "What is the boiling point of water in Celsius?",
        };

        String[][] options = {
                {"1. Friction", "2. Inertia", "3. Gravity", "4. Magnetism"},
                {"1. Earth", "2. Mars", "3. Venus", "4. Jupiter"},
                {"1. Carbon dioxide", "2. Nitrogen", "3. Oxygen", "4. Argon"},
                {"1. Respiration", "2. Transpiration", "3. Photosynthesis", "4. Digestion"},
                {"1. 0°C", "2. 212°F", "3. 100°C", "4. Both B and C"}
        };

        int[] answer = {
               3, 2, 3, 3, 4
        };

        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("*********************");
        System.out.println("Welcome To Quiz Game!");
        System.out.println("*********************");

        for(int i = 0; i <  questions.length; i++){
            System.out.println(questions[i]);

            for(String option: options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your guess? ");
            guess = scanner.nextInt();

            if(guess == answer[i]){
                System.out.println("**************");
                System.out.println("Correct Answer");
                System.out.println("**************");

                score++;
            }else{
                if (guess > 4 || guess < 1) {
                    System.out.println("Out of range option is selected");
                    System.out.println("Try again!!!");
                    //Repeating same question
                    i--;
                } else {
                    System.out.println("**************");
                    System.out.println("Wrong Answer");
                    System.out.println("**************");
                }
            }
        }

        System.out.println("***************************************");
        System.out.printf("Alright! Your Final Score is %d out of %d.\n", score, questions.length);
        System.out.println("***************************************");

        scanner.close();
    }
}