import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * CentralOffice has a list of all city officeces and prints them with all the bakeries
 */
public class CentralOffice {
    private List<CityOffice> allOffices;
    public List<CityOffice> getAllOffices() {return allOffices;}

    public CentralOffice() {
        this.allOffices = new ArrayList<>();
    }
    
    /**
    * adds an office to the list
    */
    public void addOffice(CityOffice office) {
        allOffices.add(office);
    }
    
    /**
    * removes an office to the list
    */
    public void removeOffice(CityOffice office) {
        allOffices.remove(office);
    }

    /**
    * prints all city offices with their bakeries
    */
    public void printAllOffices() {
        for (CityOffice cityoffice : allOffices) {
            System.out.println(cityoffice);
            cityoffice.printAllBakeriesNames();
        }
    }

}
