public class Main{
    public static void main(String[] args) {

        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        // %[specifier-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 45.4;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall \n", height);
        System.out.printf("Employed %b \n", isEmployed);


        // [.precision]

        double price1 = 443300.56;
        double price2 = -100000.3454;
        double price3 = -230.21;

        System.out.printf("[.precision] %.1f\n", price1);
        System.out.printf("[.precision] %.2f\n", price2);
        System.out.printf("[.precision] %.3f\n", price3);


        // %[flags]

        // + = output a plus
        // , = comma grouping seperator
        // ( = negative number are enclosed in ()
        // space = display a minus if negative, space if positive

        System.out.printf("[flags] % ,(.1f\n", price1);
        System.out.printf("[flags] % ,.2f\n", price2);
        System.out.printf("[flags] %.3f\n", price3);

        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("No. %-4d\n",id1);
        System.out.printf("No. %4d\n",id2);
        System.out.printf("No. %3d\n",id3);
        System.out.printf("No. %2d\n", id4);

    }
}