import static org.junit.jupiter.api.Assertions.*;

/**
 * Creates 4 different customers to test each vehicle and compares ride output to expected value
 */


class CustomerBusTest {

    Customer customer = new Customer("Bus");

    @org.junit.jupiter.api.Test
    void ride() {
        assertEquals("Bus; Any luggage; slow speed; 5 CHF",customer.ride());
    }
}

class CustomerSupercarTest {

    Customer customer = new Customer("Supercar");

    @org.junit.jupiter.api.Test
    void ride() {
        assertEquals("Supercar; One small one large; fast speed; 30 CHF/h",customer.ride());
    }
}

class CustomerMicroCarTest {

    Customer customer = new Customer("MicroCar");

    @org.junit.jupiter.api.Test
    void ride() {
        assertEquals("MicroCar; one small; normal speed; 12 CHF/h",customer.ride());
    }
}

class CustomerFamilyCarTest {

    Customer customer = new Customer("FamilyCar");

    @org.junit.jupiter.api.Test
    void ride() {
        assertEquals("FamilyCar; Two small two large; normal speed; 15 CHF/h",customer.ride());
    }
}

/**
    Tests for unavailable input.
    @throws NullPointerException if the cartype is not available
     */
class CustomerBatmobileTest {


    @org.junit.jupiter.api.Test
    void ride() {
        assertThrows(NullPointerException.class, () ->{Customer customer = new Customer("Batmobile");});
    }
}
