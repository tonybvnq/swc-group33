/**
 * Testing class
 */

public class MVCPatternDemo {
    public static void main(String[] args)  {

        /**
         * 1) Create a new employee
         */
        Employee employee1 = Controller.createEmployee("John",
                "Doe",
                "Test Street",
                "+41 41 000 00 00",
                "12345678");

        /**
         * 2) Print the employee name, surname and ID.
         */
        View.printEmployee(employee1);

        /**
         * 3) Update the employee address
         */
        View.updateAddress(employee1, "Test Street 456");

        /**
         * 4) Print the new address
         */
        View.printAddress(employee1);

        /**
         * 5) Update the employee phone number
         */
        View.updatePhoneNumber(employee1, "+41 41 111 11 11");

        /**
         * 6) Print the new phone number
         */
        View.printPhoneNumber(employee1);

    }
}
