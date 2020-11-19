abstract class Vehicle {
    Price price;
    Propulsion propulsion;
    Room room;
    Speed speed;

    public void setPrice(Price price){
        this.price = price;
    }


}

class MicroCar extends Vehicle{
    public MicroCar(){
        this.setPrice(CheapPrice);
    }



}