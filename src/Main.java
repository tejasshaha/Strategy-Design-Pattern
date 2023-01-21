public class Main {

    public static void main(String[] args){

        //At runtime we can call driveSlow() or driveFast()
        //In future if we need to change behaviour of Bike to drive at moderate speed then we don't
        // need to change in Bike, we can handle it through main only and code duplication is also handled.

        Vehicle vehicle = new Bike(new driveSlow());
        vehicle.drive();

        Vehicle vehicle1 = new Car(new driveModerate());
        vehicle1.drive();
    }
}
