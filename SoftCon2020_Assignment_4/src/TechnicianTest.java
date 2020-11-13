import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TechnicianTest {

    BackendTechnician Peter = new BackendTechnician("Peter", "Griffin", 1);
    WebTechnician Homer = new WebTechnician("Homer", "Simpson", 2);

    /**
     * getName returns the technician's name
     * @throws AssertionError when the customer has different name
     */
    @Test
    void getName() {
        assertEquals("Peter", Peter.getName());
        assertEquals("Homer", Homer.getName());

    }

    /**
     * getSurname returns the technician's surname
     * @throws AssertionError when the customer has different surname
     */
    @Test
    void getSurname() {
        assertEquals("Griffin", Peter.getSurname() );
        assertEquals("Simpson", Homer.getSurname());
    }

    /**
     * getId returns the technician's ID
     * @throws AssertionError when the customer has different ID
     */
    @Test
    void getID() {
        assertEquals(1, Peter.getID());
        assertEquals(2, Homer.getID());
    }

}

class WebTechnicianTest {

    WebTechnician Jens = new WebTechnician("Jens", "Knossala", 1);

    /**
     * fix_website prints "reparations complete"
     * @throws AssertionError when it the print is different
     */
    @Test
    void fix_website() throws InterruptedException {
        assertEquals("reparations complete", Jens.fix_website());
    }

}

class BackendTechnicianTest {

    BackendTechnician Hans = new BackendTechnician("Hans", "Muster", 1);

    /**
     * fix_backend prints "fixed!"
     * @throws AssertionError when it the print is different
     */
    @Test
    void fix_backend(String id) {
        assertEquals("fixed!", Hans.fix_backend(1));
    }

}