import java.util.*;
abstract class Vehicle {
    String vehicleName;
    Price price;
    Propulsion propulsion;
    Room room;
    Speed speed;

    public Price getPrice() {
        return price;
    }

    public Propulsion getPropulsion() {
        return propulsion;
    }

    public Room getRoom() {
        return room;
    }

    public Speed getSpeed() {
        return speed;
    }

    public String getVehicleName(){
        return vehicleName;
    }




}

class MicroCar extends Vehicle{
    public MicroCar(){
        vehicleName = "MicroCar";
        price = new CheapPrice();
        propulsion = new ElectricPropulsion();
        room = new OneSmall();
        speed = new NormalSpeed();
    }
}
class FamilyCar extends Vehicle{
    public FamilyCar(){
        vehicleName = "FamilyCar";
        price = new MiddlePrice();
        propulsion = new GasolinePropulsion();
        room = new TwoSmallTwoLarge();
        speed = new NormalSpeed();
    }
}
class Supercar extends Vehicle{
    public Supercar() {
        vehicleName = "Supercar";
        price = new HighPrice();
        propulsion = new GasolinePropulsion();
        room = new OneSmallOneLarge();
        speed = new FastSpeed();
    }
}
class Bus extends Vehicle{
    public Bus(){
        vehicleName = "Bus";
        price = new BusPrice();
        propulsion = new DieselPropulsion();
        room = new AnySize();
        speed = new SlowSpeed();
    }
}