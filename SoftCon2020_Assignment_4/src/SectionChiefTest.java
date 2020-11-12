import org.junit.Test;

import static org.junit.Assert.*;

public class SectionChiefTest {

    SectionChief SectionKevin = new SectionChief("Kevin","Kevinson", "789", "Chicago");Customer Max = new Customer("Musterman", "Max", 30, 12, 16);

    /**
     * addcustomer adds a Customer object to the employees customer arrayList
     * @throws AssertionError when the customer is not found the the customers arrayList
     */
    @Test
    public void addCustomer() {
        SectionKevin.addCustomer(Max);
        assertTrue(SectionKevin.getCustomerList().contains(Max));
    }

    /**
     * removesCustomer should remove a Customer from the employees customer list
     * @throws AssertionError when the customer is found the the customers arrayList
     */
    @Test
    public void removeCustomer() {
        SectionKevin.removeCustomer(Max);
        assertFalse(SectionKevin.getCustomerList().contains(Max));
    }

    /**
     * customerIsInList chechks if a customer is in the employees customer arrayList
     * first add a customer to the list to then check if it is found in the arrayList
     *
     * @throws AssertionError when the customer is not found the the customers arrayList
     */
    @Test
    public void customerIsinList() {
        SectionKevin.addCustomer(Max);
        assertTrue(SectionKevin.customerIsinList(Max));
    }

    /**
     * upgradeRegularToGold upgrades a Customers level from regular to gold
     *
     * @throws AssertionError when the customer level is not set to gold
     */
    @Test
    public void upgradeRegularToGold() {
        SectionKevin.upgradeRegularToGold(Max);
        assertSame(Max.getCurrentLevel(), Customer.customerLevel.Gold);}

    /**
     * upgradeGoldToPlatinum upgrades a Customers level from gold to platinum
     *
     * @throws AssertionError when the customer level is not set to platinum
     */
    @Test
    public void upgradeGoldToPlatinum() {
        Max.setcustomerLevel(Customer.customerLevel.Gold);
        SectionKevin.upgradeGoldToPlatinum(Max);
        assertSame(Max.getCurrentLevel(), Customer.customerLevel.Platinum);}

    /**
     * downgradeGoldToRegular downgrades a Customers level from gold to regular
     * first set the level to gold, then downgrade to regular
     *
     * @throws AssertionError when the customer level is not set to regular
     */
    @Test
    public void downgradeGoldToRegular() {
        Max.setcustomerLevel(Customer.customerLevel.Gold);
        SectionKevin.downgradeGoldToRegular(Max);
        assertSame(Max.getCurrentLevel(), Customer.customerLevel.Regular);}
    }
