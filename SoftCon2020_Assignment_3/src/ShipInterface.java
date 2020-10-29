import java.util.ArrayList;

public interface ShipInterface {

    public  void setShipAmount(int amount);

    public void setShipLetter(char letter);

    public void setShipName(String name);

    public void setShipLength(int length);

    public void setShipCoordinates(String coordinates);

    public String getShipname();

    public int getShipLength();

    public  int getShipAmount();

    public char getShipLetter();

    public ArrayList<String> getShipCoordinates();

    //  checks if amount is not 0,  calles the positioning method and lowers the amount of ships by 1
    public void setShip(Initialization player, String coordinate1, String coordinate2, NamedRow[] rowList, boolean isComputer);

    };


