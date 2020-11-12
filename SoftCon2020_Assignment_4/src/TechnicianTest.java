import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TechnicianTest {

    BackendTechnician Peter = new BackendTechnician("Peter", "Griffin", 1);
    WebTechnician Homer = new WebTechnician("Homer", "Simpson", 2);

    @Test
    void getName() {
        assertEquals(Peter.getName(), "Peter");
        assertEquals(Homer.getName(), "Homer");

    }

    @Test
    void getSurname() {
        assertEquals(Peter.getSurname(), "Griffin");
        assertEquals(Homer.getSurname(), "Simpson");
    }

    @Test
    void getID() {
        assertEquals(Peter.getID(), 1);
        assertEquals(Homer.getID(), 2);
    }

}