import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer customer = new Customer("Bus");

    @org.junit.jupiter.api.Test
    void ride() {
        assertEquals("Bus; any size; slow speed; 5 CHF",customer.ride());
    }
}