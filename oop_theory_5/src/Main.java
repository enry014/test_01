import java.util.Vector;

public class Main {
    public static void main(String[] args){

        // Polymorphism = "POLY" = "MANY"
        //                "MORPH" = "SHAPE"
        //                Objects can identify as other objects.
        //                Objects can be treated as objects of a common superclass.

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();
        System.out.println();

        Vehicle[] vehicles = {car, bike, boat};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }


        // Runtime polymorphism = When the method that gets executed is decided
        //                        at runtime based on the actual type of the object.


    }
}
