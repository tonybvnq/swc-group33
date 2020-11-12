import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer Sebastian = new Customer("Sebastian", "Vettel", 33, 12345, 445344);
    SavingsAccount main = new SavingsAccount();


    @Test
    void getFullName() {
        assertEquals(Sebastian.getFullName(), "Sebastian Vettel");
    }

    @Test
    void getAge() {
        assertEquals(Sebastian.getAge(), 33);
    }

    @Test
    void getAccountNumber() {
        assertEquals(Sebastian.getAccountNumber(), 12345);
    }

    @Test
    void getSavingsAccount() {

        Sebastian.setSavingsAccount(main);
        assertEquals(Sebastian.getSavingsAccount(), main);
    }

    @Test
    void getUID() {
        assertEquals(Sebastian.getUID(), 445344);
    }

    @Test
    void getCurrentLevel() {
        assertEquals(Sebastian.getCurrentLevel(), Customer.customerLevel.Regular);

    }

    @Test
    void getSerialnr() {
        assertEquals(Sebastian.getSerialnr(), 1);
    }

    @Test
    void deposit() {
        Sebastian.deposit(420);
        assertEquals(main.getBalance(), 420);
    }

    @Test
    void withdraw() throws Exception {
        Sebastian.deposit(420);
        Sebastian.withdraw(120);
        assertEquals(main.getBalance(), 300);
    }
}