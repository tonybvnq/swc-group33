import java.util.EmptyStackException;

/**
 * Controller class
 */

public class Controller {

    static Employee createEmployee(String name, String surname, String address, String telephoneNumber, String uniqueID){
        return new Employee(name, surname, address, telephoneNumber, uniqueID);
    }

    static void updateAddress(Employee employee, String address){
        employee.setAddress(address);
    }

    static void updatePhoneNumber(Employee employee, String number){
        employee.setTelephoneNumber(number);
    }
}