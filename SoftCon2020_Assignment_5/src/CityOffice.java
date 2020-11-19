import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CityOffice {
    private String name;
    private List<Bakery> childBakeries;
    public String getName() {return name;}
    public List<Bakery> getChildBakeries() {return childBakeries;}

    public CityOffice(String uniqueName) {
        this.name = "City office " + uniqueName;
        this.childBakeries = new ArrayList<>();
    }

    public void addBakery(Bakery bakery) {
        childBakeries.add(bakery);
    }

    public void removeBakery(Bakery bakery) {
        childBakeries.remove(bakery);
    }

    public void printAllBakeriesNames() {
        System.out.print(getChildBakeries());
    }
}
