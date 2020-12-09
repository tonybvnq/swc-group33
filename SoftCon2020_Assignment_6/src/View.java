/**
 * View class
 */

public class View {

    public static void printEmployee(Employee employee){
        System.out.println("Employee: ");
        System.out.println("Name: " + employee.getName());
        System.out.println("Surname: " + employee.getSurname());
        System.out.println("ID: " + employee.getUniqueID());

    }
    public static void updateAddress(Employee employee, String address){
        Controller.updateAddress(employee, address);
    }

    public static void printAddress(Employee employee) {
        System.out.println(employee.getAddress());
    }

    public static void updatePhoneNumber(Employee employee, String number) {
        Controller.updatePhoneNumber(employee, number);
    }

    public static void printPhoneNumber(Employee employee){
        System.out.println(employee.getTelephoneNumber());
    }
}