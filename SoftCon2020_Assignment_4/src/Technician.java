import java.util.concurrent.TimeUnit;

abstract class Technician {

    private String name;

    private String surname;

    private int ID;

    public String getName() { return name; }

    public String getSurname() { return surname; }

    public int getID() { return ID; }

    public Technician(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.ID = id;
    }
}

class WebTechnician extends Technician {

        public WebTechnician(String name, String surname, int id) {
            super(name, surname, id);
        }

        public String fix_website() throws InterruptedException {
            try {
                TimeUnit.SECONDS.sleep(30);
                return "reparations complete";
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
                return null;
            }
        }

    }

class BackendTechnician extends Technician {

        public BackendTechnician(String name, String surname, int id) {
            super(name, surname, id);
        }

        public String fix_backend(int ID) {
            return "fixed!";
        }
    }