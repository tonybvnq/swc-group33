import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
* An office in a specific city with all its bakeries
*/
public class CityOffice {
    private String name;
    private List<Bakery> childBakeries;
    public String getName() {return name;}
    public List<Bakery> getChildBakeries() {return childBakeries;}

    public CityOffice(String uniqueName) {
        this.name = "City office " + uniqueName;
        this.childBakeries = new ArrayList<>();
    }

    /**
    * Adds bakery to the city
    */
    public void addBakery(Bakery bakery) {
        childBakeries.add(bakery);
    }

    /**
    * removes bakery from the city
    */
    public void removeBakery(Bakery bakery) {
        childBakeries.remove(bakery);
    }

    
    /**
    * prints all bakeries from a specific city 
    */
    public void printAllBakeriesNames() {
        System.out.print(getChildBakeries());
    }
}
