import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer Sebastian = new Customer("Sebastian", "Vettel", 33, 12345, 445344);
    SavingsAccount main = new SavingsAccount();

    @Test
    void getFullName() {
        assertEquals("Sebastian Vettel", Sebastian.getFullName());
    }

    @Test
    void getAge() {
        assertEquals(33, Sebastian.getAge());
    }

    @Test
    void getAccountNumber() {
        assertEquals(12345, Sebastian.getAccountNumber());
    }

    @Test
    void getSavingsAccount() {
        Sebastian.setSavingsAccount(main);
        assertEquals(main, Sebastian.getSavingsAccount());
    }

    @Test
    void getUID() {
        assertEquals(445344, Sebastian.getUID());
    }

    @Test
    void getCurrentLevel() {
        assertEquals(Customer.customerLevel.Regular, Sebastian.getCurrentLevel());

    }

    @Test
    void getSerialnr() {
        assertEquals(1, Sebastian.getSerialnr());
    }

    @Test
    void deposit() {
        Sebastian.deposit(420);
        assertEquals(420, main.getBalance());
    }

    @Test
    void withdraw() throws Exception {
        Sebastian.deposit(420);
        Sebastian.withdraw(120);
        assertEquals(300, main.getBalance());
    }
}