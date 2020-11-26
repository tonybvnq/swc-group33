import java.util.*;

abstract class Vehicle {
    private Price price;
    private Propulsion propulsion;
    private Room room;
    private Speed speed;

    public void setPrice(Price price){
        this.price = price;
    }
    public void setPropulsion(Propulsion propulsion){
        this.propulsion = propulsion;
    }
    public void setRoom(Room room){
        this.room = room;
    }
    public void setSpeed(Speed speed){
        this.speed = speed;
    }
}

class MicroCar extends Vehicle{
    public MicroCar(){
        this.setPrice(CheapPrice);
        this.setPropulsion(ElectricPropulsion);
        this.setRoom();
        this.setSpeed(NormalSpeed);
    }
}

class FamilyCar extends Vehicle{
    public FamilyCar(){
        this.setPrice(MiddlePrice);
        this.setPropulsion(GasolinePropulsion);
        this.setRoom();
        this.setSpeed(NormalSpeed);
    }
}

class Supercar extends Vehicle{
    public Supercar(){
        this.setPrice(HighPrice);
        this.setPropulsion(GasolinePropulsion);
        this.setRoom();
        this.setSpeed(FastSpeed);
    }
}

class Bus extends Vehicle{
    public Bus(){
        this.setPrice(CheapPrice);
        this.setPropulsion(DieselPropulsion);
        this.setRoom();
        this.setSpeed(SlowSpeed);
    }
}