import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name;
        // System.out.println("Enter your name: ");
        // name = scanner.nextLine();
        name = "Thierry";

        int age;
        // System.out.println("Enter your age: ");
        // age = scanner.nextInt();
        age = 15;

        // GROUP 1
        if(name.isEmpty()){
            System.out.println("You didn't enter your name!");
        }
        else{
            System.out.println("Hello " + name + "!");
        }

        // GROUP 2
        if(age >= 65){
            System.out.println("You are a senior.");
        }
        else if(age >= 18){
            System.out.println("You are adult.");
        }
        else if(age == 0){
            System.out.println("You are a baby yet.");
        }
        else{
            System.out.println("You are young.");
        }

        System.out.println("\nRandom numbers");
        randomNumbers();

        System.out.println("\nMath Class");
        mathClass();

        System.out.println("\nprintf");
        printf();

    }

    public static void randomNumbers(){

        Random random = new Random();

        int number;
        number = random.nextInt(1,7);

        double number_1;
        number_1 = random.nextDouble();

        boolean isHeads;
        isHeads = random.nextBoolean();

        System.out.println(number + "\n" + number_1 + "\n" + isHeads);
    }

    public static void mathClass(){

        System.out.println(Math.PI);

        double result;

        result = Math.pow(2, 3); // 8
        result = Math.abs(-15); // 15
        result = Math.sqrt(9); // 3
        result = Math.round(3.14); // 3
        result = Math.ceil(3.14); // 4
        result = Math.floor(3.99); //3
        // Math.max(), Math.min()

        System.out.println(result);


        double circumference;
        double area;
        double volume;

        double radius = 5;

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius,2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius,3);

        System.out.printf("The circumference is: %.1fcm\n" , circumference);
        System.out.printf("The area is: %.1fcm²\n", area);
        System.out.printf("The volume is: %.1fcm³\n" , volume);

    }

    public static void printf(){

        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s.\n", name);
        System.out.printf("Your name start with a %c.\n", firstLetter);
        System.out.printf("You are %d years old.\n", age);
        System.out.printf("You are %.1f inches tall.\n", height);
        System.out.printf("Employed: %b.\n\n", isEmployed);

        // [flags]

        // output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price1 = 9909.99;
        double price2 = -54.01;

        System.out.printf("%+.2f\n", price1);
        System.out.printf("%,.2f\n", price1);
        System.out.printf("%(.2f\n", price2);
        System.out.printf("% .2f\n", price1);
        System.out.printf("% .2f\n\n", price2);


        //[width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

    }
}

