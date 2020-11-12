import org.junit.Test;

import static org.junit.Assert.*;

public class MainChiefTest {


    MainChief MainThomas = new MainChief("Thomas", "Thomason", "456");
    Customer Max = new Customer("Musterman", "Max", 30, 12, 16);

    /**
     * addCustomer adds a Customer object to the employees customer arrayList
     * @throws AssertionError when the customer is not found the the customers arrayList
     */
    @Test
    public void addCustomer() {
        MainThomas.addCustomer(Max);
        assertTrue(MainThomas.getCustomerList().contains(Max));
    }

    /**
     * removesCustomer should remove a Customer from the employees customer list
     * @throws AssertionError when the customer is found the the customers arrayList
     */
    @Test
    public void removeCustomer() {
        MainThomas.removeCustomer(Max);
        assertFalse(MainThomas.getCustomerList().contains(Max));
    }

    /**
     * customerIsInList chechks if a customer is in the employees customer arrayList
     * first add a customer to the list to then check if it is found in the arrayList
     *
     * @throws AssertionError when the customer is not found the the customers arrayList
     */
    @Test
    public void customerIsinList() {
        MainThomas.addCustomer(Max);
        assertTrue(MainThomas.customerIsinList(Max));
    }

    /**
     * upgradeRegularToGold upgrades a Customers level from regular to gold
     *
     * @throws AssertionError when the customer level is not set to gold
     */
    @Test
    public void upgradeRegularToGold() {
        MainThomas.upgradeRegularToGold(Max);
        assertSame(Max.getCurrentLevel(), Customer.customerLevel.Gold);}

    /**
     * upgradeGoldToPlatinum upgrades a Customers level from gold to platinum
     *
     * @throws AssertionError when the customer level is not set to platinum
     */
    @Test
    public void upgradeGoldToPlatinum() {
        Max.setcustomerLevel(Customer.customerLevel.Gold);
        MainThomas.upgradeGoldToPlatinum(Max);
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
        MainThomas.downgradeGoldToRegular(Max);
        assertSame(Max.getCurrentLevel(), Customer.customerLevel.Regular);}

    /**
     * downgradeGoldToRegular downgrades a Customers platinum level to gold
     * first set the level platinum gold, then downgrade to gold
     *
     * @throws AssertionError when the customer level is not set to gold
     */
    @Test
    public void downgradePlatinumToGold() {
        Max.setcustomerLevel(Customer.customerLevel.Platinum);
        MainThomas.downgradePlatinumToGold(Max);
        assertSame(Customer.customerLevel.Gold,Max.getCurrentLevel());}

    /**
     * downgradeGoldToRegular downgrades a Customers platinum level to regular
     * first set the level platinum gold, then downgrade to regular
     *
     * @throws AssertionError when the customer level is not set to regular
     */
    @Test
    public void downgradePlatinumToRegular() {
        Max.setcustomerLevel(Customer.customerLevel.Platinum);
        MainThomas.downgradePlatinumToRegular(Max);
        assertSame(Customer.customerLevel.Regular ,Max.getCurrentLevel());}

}

