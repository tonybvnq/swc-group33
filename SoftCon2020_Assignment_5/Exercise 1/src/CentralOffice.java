import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CentralOffice {
    private List<CityOffice> allOffices;
    public List<CityOffice> getAllOffices() {return allOffices;}

    public CentralOffice() {
        this.allOffices = new ArrayList<>();
    }

    public void addOffice(CityOffice office) {
        allOffices.add(office);
    }

    public void removeOffice(CityOffice office) {
        allOffices.remove(office);
    }

    public void printAllOffices() {
        for (CityOffice cityoffice : allOffices) {
            cityoffice.printAllBakeriesNames();
        }
    }

}
