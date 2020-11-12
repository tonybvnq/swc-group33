import org.junit.Test;

import static org.junit.Assert.*;

public class RegularEmployeeTest {

    RegularEmployee RegularJohn = new RegularEmployee("John", "Johnson", "123");
    Customer Max = new Customer("Musterman", "Max", 30, 12, 16);
    Customer peter = new Customer("Musterman", "Max", 30, 12, 16);


    /**
     *
     * @author Dean Heizmann
     * @version 1.0
     * @since 12.11.2020
     *
     * testing the employee class for each subclass of employee
     * addcustomer adds a Customer object to the employees customer arrayList
     *
     * removeCustomer removes a Customer from that list
     *
     * customerIsInList checks if a customer is in that list
     *
     * upgrade" "to" " changes the current customer level to a new one
     */


    /**
     * addcustomer adds a Customer object to the employees customer arrayList
     *
     * @throws AssertionError when the customer is not found the the customers arrayList
     */
    @Test
    public void addCustomer() {
        RegularJohn.addCustomer(Max);
        assertTrue(RegularJohn.getCustomerList().contains(Max));
    }

    /**
     * removesCustomer should remove a Customer from the employees customer list
     * @throws AssertionError when the customer is found the the customers arrayList
     */
    @Test
    public void removeCustomer() {
        RegularJohn.removeCustomer(Max);
        assertFalse(RegularJohn.getCustomerList().contains(Max));
    }

    /**
     * customerIsInList chechks if a customer is in the employees customer arrayList
     * first add a customer to the list to then check if it is found in the arrayList
     *
     * @throws AssertionError when the customer is not found the the customers arrayList
     */
    @Test
    public void customerIsinList() {
        RegularJohn.addCustomer(Max);
        assertTrue(RegularJohn.customerIsinList(Max));
    }

    /**
     * upgradeRegularToGold upgrades a Customers level from regular to gold
     *
     * @throws AssertionError when the customer level is not set to gold
     */
    @Test
    public void upgradeRegularToGold() {
        RegularJohn.upgradeRegularToGold(Max);
        assertSame(Max.getCurrentLevel(), Customer.customerLevel.Gold);
    }
}