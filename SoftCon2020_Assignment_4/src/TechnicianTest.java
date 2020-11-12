import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TechnicianTest {

    BackendTechnician Peter = new BackendTechnician("Peter", "Griffin", 1);
    WebTechnician Homer = new WebTechnician("Homer", "Simpson", 2);

    @Test
    void getName() {
        assertEquals("Peter", Peter.getName());
        assertEquals("Homer", Homer.getName());

    }

    @Test
    void getSurname() {
        assertEquals("Griffin", Peter.getSurname() );
        assertEquals("Simpson", Homer.getSurname());
    }

    @Test
    void getID() {
        assertEquals(1, Peter.getID());
        assertEquals(2, Homer.getID());
    }

}

class WebTechnicianTest {

    WebTechnician Jens = new WebTechnician("Knossala", "Simpson", 2);

    @Test
    void fix_website() {

    }

}