public class Main {
    public static void main(String[] args){

        // Arithmetic Operators

        int x = 10;
        int y = 3;
        int z;

        // z = x + y;
        // z = x - y:
        // z = x * y;
        // z = x / y;
        z = x % y;

        System.out.println(z);

        //__________________________________________________________________
        // Augmented Assignment Operators

        int a = 10;
        int b = 3;

        // a += b;
        // a -= b;
        // a *= y;
        // a /= b;
        a %= b;

        System.out.println(a);

        //__________________________________________________________________
        // Increment and Decrement Operators

        int i = 1;

        i++;
        System.out.println("i is now: " + i);

        i--;
        System.out.println("i is now: " + i);

        //__________________________________________________________________
        // ORDER OF OPERATIONS [P-E-M-D-A-S]
        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println(result);

    }
}
