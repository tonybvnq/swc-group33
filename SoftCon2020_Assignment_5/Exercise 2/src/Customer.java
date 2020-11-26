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

    
    /**
     * Customers have a specific car type and a method to print the car type's name, space, speed and price
     */
    public Customer(String vehicletype) {
        this.vehicletype = vehicletype;
        switch (vehicletype) {
            case "Bus" -> vehicle = new Bus();
            case "FamilyCar" -> vehicle = new FamilyCar();
            case "MicroCar" -> vehicle = new MicroCar();
            case "Supercar" -> vehicle = new Supercar();
        }

    }

     /**
     * Prints the name, space, speed and price of the specific car type
     */ 
    public void ride(){
        System.out.println(vehicletype + "; "
                + vehicle.getRoom() + "; "
                + vehicle.getSpeed() + "; "
                + vehicle.getPrice());
    }

}
