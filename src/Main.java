import java.util.Random;

public class Main{
    public static void main(String[] args){

        Random random = new Random();

        boolean isHeads;
        double randomDouble;

        isHeads = random.nextBoolean();

        randomDouble = random.nextDouble(1, 233);

        if(isHeads){
            System.out.println("Heads");
        } else{
            System.out.println("Tails");
        }
        System.out.println("Random double " + randomDouble);
    }
}