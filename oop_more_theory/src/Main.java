import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){

        // static = Makes a variable or method belong to the class
        //          rather then to any specific object.
        //          Commonly used for utility methods or shared resources


        Friend friend1 = new Friend("enry");
        Friend friend2 = new Friend("makelele");

        System.out.println("Num of friends: " + Friend.numOfFriends); // when calling static var call it with Class not Object

        System.out.println();

        Friend.showFriends(); // showFriends() is utility method - same as Math.round();

        // Inheritance = One class inherits the attributes and methods
        //               from another class.
        //               Child <- Parent <- Grandparent

        System.out.println();
        System.out.println("Inheritance");

        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive);
        dog.eat();
        System.out.println(cat.isAlive);
        cat.eat();
        System.out.println();
        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();


        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes

        System.out.println();
        System.out.println("super class");

        Person person = new Person("Thiery", "Enry");
        person.showName();

        Student student = new Student("Claude", "Makelele", 3.5);
        student.showName();
        student.showGPA();

        Employee employee = new Employee("Majkl", "Olise", 300000);
        employee.showName();
        employee.showSalary();

        // Method overriding = When a subclass provides its own
        //                     implementation of a method that is already defined.
        //                     Allows for code reusability and give specific implementations.

        System.out.println();
        System.out.println("Method overriding");
        Fish fish = new Fish();
        dog.move();
        cat.move();
        fish.move();


    }
}
