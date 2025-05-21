import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int numOfFood;

        System.out.print("Enter the num of foods you want ?");
        numOfFood = scanner.nextInt();
        //Integer creates integer buffer that makes it bypass any string
        //Solution
        scanner.nextLine();

        if(numOfFood < 0){
            System.out.println("Food number can't be negative");
        } else{
            // In java we need explicitly set array size that only contains same datatype
            foods = new String[numOfFood];

            for(int i = 0; i < foods.length; i++){
                System.out.printf("Enter the food number-%d: ", i + 1);
                foods[i] = scanner.nextLine();
            }

            for(String food : foods){
                System.out.println(food);
            }
        }

    }
}