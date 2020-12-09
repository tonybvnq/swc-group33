import java.util.*;


public class Control {

    public void createEmployee(String name, String surname, String address, String telephoneNumber, String uniqueID){
        Employee employee1 = new Employee();

        employee1.setName(name);
        employee1.setSurname(surname);
        employee1.setAddress(address);
        employee1.setTelephoneNumber(telephoneNumber);
        employee1.setUniqueID(uniqueID);


    }

}
