import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Customers have a specific car type and a method to print the car type's name, space, speed and price
 */
public class Customer {
    private String vehicletype;
    private Vehicle vehicle;
    public String getVehicletype() { return vehicletype; }
    public Vehicle getVehicle() {
        return vehicle;
    }
    private List<String> list = Arrays.asList("Bus", "FamilyCar", "MicroCar", "Supercar");

    /**
     * Customers have a specific car type and a method to print the car type's name, space, speed and price
     */
    public Customer(String vehicletype) {
        this.vehicletype = vehicletype;

        if (list.contains(vehicletype)) {
            switch (vehicletype) {
                case "Bus" -> vehicle = new Bus();
                case "FamilyCar" -> vehicle = new FamilyCar();
                case "MicroCar" -> vehicle = new MicroCar();
                case "Supercar" -> vehicle = new Supercar();
            }
        }

        else {
            System.out.println("This vehicle type is not available");
            throw new NullPointerException();
        }
    }

     /**
     * Prints the name, space, speed and price of the specific car type
      * @return
      */
    public String ride(){
        System.out.println(vehicletype + "; "
                + vehicle.room.getRoom() + "; "
                + vehicle.speed.getSpeed() + "; "
                + vehicle.price.getPrice());
        return vehicletype + "; "
                + vehicle.room.getRoom() + "; "
                + vehicle.speed.getSpeed() + "; "
                + vehicle.price.getPrice();
    }

}
