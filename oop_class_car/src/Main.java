public class Main {
    public static void main(String[] args) {

        // Object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type


        // Car car = new Car();

        // car.isRunning = true;

        // System.out.println(car.make);
        // System.out.println(car.model);
        // System.out.println(car.year);
        // System.out.println(car.price);
        // System.out.println(car.isRunning);

        // System.out.println();


        // car.start();
        // car.stop();


        // constructor = A special method to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values

        Student student1 = new Student("Spongebob", 30 , 3.2);
        Student student2 = new Student("Patrick", 34, 1.5);

        System.out.println(student1.name);
        System.out.println(student2.name);

        student1.study();

        System.out.println();
        // overloaded constructor = Allow a class to have multiple constructors
        //                          with different parameter lists.
        //                          Enable objects to be initialized in various ways.

        User user1 = new User("enry");

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println();
        User user2 = new User("jarno", "jarno@truli.com");

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println();
        User user3 = new User();
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);


    }
}
