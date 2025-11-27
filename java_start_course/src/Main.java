
public class Main {
    public static void main(String[] args){

        variables();

    }

    public static void variables(){
        // variables
        // Primitive vs Reference
        // int          string
        // double       array
        // char         object
        // boolean

        // Primitive = simple value stored directly in memory (stack)
        // Reference = memory address (stack) that points to the (heap)

        //--------------------
        // 1. declaration
        // 2. assignment

        int year = 2;
        System.out.println("The year is: " + year);

        double price = 15.99;
        System.out.println("The price is: $" + price);

        char grade = 'A';
        char symbol = '!';
        System.out.println(symbol);

        boolean isStudent = true;
        System.out.println(isStudent);

        if(isStudent){
            System.out.println("He is a student!");
        }
        else{
            System.out.println("He is not a student!");
        }

        // byte, short, long, float, void

        String name = "Thierry";
        System.out.println("His name is: " + name);
    }

}
