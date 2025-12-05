public class Main {

    public static void main(String[] args){

        // .toString() = Method inherited from the Object Class.
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details.

        Car car = new Car("Ford", "Mustang", 2025, "Black");

        System.out.println(car);

        // System.out.println(car.color + " " + car.year + " " + car.make + " " + car.model);


    }
}
