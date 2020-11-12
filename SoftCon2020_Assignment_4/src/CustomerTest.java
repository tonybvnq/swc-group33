import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer Sebastian = new Customer("Sebastian", "Vettel", 33, 12345, 445344);
    SavingsAccount main = new SavingsAccount();

    /**
     * getFullName returns the customer's name
     * @throws AssertionError when the customer has different name
     */
    @Test
    void getFullName() {
        assertEquals("Sebastian Vettel", Sebastian.getFullName());
    }

    /**
     * getAge returns the customer's age
     * @throws AssertionError when the customer has different age
     */
    @Test
    void getAge() {
        assertEquals(33, Sebastian.getAge());
    }

    /**
     * getAccoundNumber returns the customer's account number
     * @throws AssertionError when the customer has different name
     */
    @Test
    void getAccountNumber() {
        assertEquals(12345, Sebastian.getAccountNumber());
    }

    /**
     * getSavingsAccount returns the customer's savings account
     * @throws AssertionError when the customer has different savings account
     */
    @Test
    void getSavingsAccount() {
        Sebastian.setSavingsAccount(main);
        assertEquals(main, Sebastian.getSavingsAccount());
    }

    /**
     * getUID returns the customer's unique ID
     * @throws AssertionError when the customer has different unique ID
     */
    @Test
    void getUID() {
        assertEquals(445344, Sebastian.getUID());
    }

    /**
     * getCurrentLevel returns the customer's current level
     * @throws AssertionError when the customer has different level
     */
    @Test
    void getCurrentLevel() {
        assertEquals(Customer.customerLevel.Regular, Sebastian.getCurrentLevel());

    }

    /**
     * getSerialnr returns the customer's serial number
     * @throws AssertionError when the customer has different serial number
     */
    @Test
    void getSerialnr() {
        assertEquals(1, Sebastian.getSerialnr());
    }

    /**
     * deposit adds the provided amount to the savings account
     * @throws AssertionError when the balance doesn't match all deposit amount
     */
    @Test
    void deposit() {
        Sebastian.deposit(420);
        Sebastian.deposit(80);
        assertEquals(500, main.getBalance());
    }

    /**
     * withdraw removes provided amount from the savings account
     * @throws AssertionError when the balance doesn't match all withdraws
     */
    @Test
    void withdraw() throws Exception {
        Sebastian.deposit(420);
        Sebastian.withdraw(120);
        Sebastian.withdraw(100);
        assertEquals(200, main.getBalance());
    }
}