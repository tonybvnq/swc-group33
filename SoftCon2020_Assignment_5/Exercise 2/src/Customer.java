/**
 * Customers have a specific car type and a method to print the car type's name, space, speed and price
 */
public class Customer {
    private String cartype;
    public String getCartype() {return cartype; }
    
    
    /**
     * Customers have a specific car type and a method to print the car type's name, space, speed and price
     */
    public Customer(String cartype) {
        this.cartype = cartype;
    }

     /**
     * Prints the name, space, speed and price of the specific car type
     */ 
    public void ride(){
        System.out.println(cartype.getName() + "; "
                + cartype.getSpace() + "; "
                + cartype.getSpeed() + "; "
                + cartype.getPrice());
    }

}
