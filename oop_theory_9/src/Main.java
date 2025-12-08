public class Main {
    public static void main(String[] args){

        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't warp primitives unless you need an object.
        //                   Allows use of Collections Framework and static Utility Methods.


        // int a = 123;

        // old way
        // Integer a = new Integer(123);
        // Double b = new Double(3.14);

        // Autoboxing
        Integer a = 123;
        Double b = 3.14;

        // Unboxing
        int x = a;


        // Convert primitive data type to String
        String c = Integer.toString(123);
        String d = Double.toString(3.14);
        String e = Character.toString('@');
        String f = Boolean.toString(false);

        String y = c + d + e + f;

        System.out.println(y);

        System.out.println();

        // Convert (parse) String to primitive data type
        int g = Integer.parseInt("123");
        double h = Double.parseDouble("3.14");
        char i = "Pizza".charAt(0);
        boolean j = Boolean.parseBoolean("true");

        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println();

        char letter1 = 'b';
        char letter2 = '$';

        System.out.println(Character.isLetter(letter1));
        System.out.println(Character.isLetter(letter2));
        System.out.println(Character.isUpperCase(letter1));


    }
}
