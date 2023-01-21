public class Vehicle {

    VehicleInterface vehicleInterface;
    public Vehicle(VehicleInterface vehicleInterface){
        this.vehicleInterface = vehicleInterface;
    }

    public void drive(){
        vehicleInterface.drive();
    }
}
