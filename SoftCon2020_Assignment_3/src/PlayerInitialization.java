import java.util.ArrayList;
import java.util.List;

// FOR EVERY PLAYER THE INITIALIZATION CAN HAPPEN ONLY ONCE. THE PLAYER GETS AN OWN BATTLEFIELD AND SHIPS ASSIGNED

abstract class Initialization{

    // List to keep track of the slots that are occupied by the players ships.
    // Every initialization will create an own list for the player
    private List<String> occupiedslots;

    private NamedRow[] rowList;

    private Ship[] shipList;

    private int shipcounter;

    public Boolean isInOccupiedSlots(String coordinate){ return this.occupiedslots.contains(coordinate);};

    public List<String> getOccupiedSlots(){return this.occupiedslots;};

    public  void setOccupiedslots(String coordinate){ this.getOccupiedSlots().add(coordinate);};

    public void createPlayersOccupiedSlotsList(List<String> occlist){
        this.occupiedslots = occlist;
    }

    public void setRowList(NamedRow[] createdrowlist){
        this.rowList = createdrowlist;
    }

    public  void setShiplist(Ship[] createdshiplist){
        this.shipList = createdshiplist;
    }

    public void setShipcounter(int val){this.shipcounter = val;}

    public NamedRow[] getRowList() {
        return rowList;
    }

    public Ship[] getShipList() {
        return shipList;
    }

    public int getShipcounter(){return shipcounter;}

    // list to keep track of the slots that are hit
    private List<String> hitSlots = new ArrayList<String>();
    public Boolean isInHitSlots(String coordinate){ return this.hitSlots.contains(coordinate);};
    public List<String> getHitSlots(){ return this.hitSlots;};
    public void setHitSlots(String coordinate){ this.getHitSlots().add(coordinate);};

};



public class PlayerInitialization extends Initialization {

    // SINGLETON
    // PLAYER INITIALIZATION SHOULD REMAIN THE ONLY OF ITS KIND, WE CREATE ONE AND NO MORE, IT REMAINS A SINGLETON

    private static PlayerInitialization playerinit;

    private static List<String> player_1occupiedslots = new ArrayList<String>();

    private PlayerInitialization(){
        createPlayersOccupiedSlotsList(player_1occupiedslots);
        setRowList(createRowList());
        setShiplist(createShipList());
        setShipcounter(this.getShipList().length);
    };

    // CREATES THE ONLY SINGELTON OF THIS OBJECT
    public static PlayerInitialization getInitialization(){
        if (playerinit == null){
            return new PlayerInitialization();
        }
        return playerinit;
    }

    // FUNCTION TO INITIALLY CREATE THE PLAYERS BATTLEFIELD; THIS IS NEVER CALLED AGAIN BEFORE GAME IS OVER
    public NamedRow[] createRowList(){
        //Create and maintain rows with Lists
        NamedRow player1_row0 = new NamedRow(0);
        NamedRow player1_row1 = new NamedRow(1);
        NamedRow player1_row2 = new NamedRow(2);
        NamedRow player1_row3 = new NamedRow(3);
        NamedRow player1_row4 = new NamedRow(4);
        NamedRow player1_row5 = new NamedRow(5);
        NamedRow player1_row6 = new NamedRow(6);
        NamedRow player1_row7 = new NamedRow(7);
        NamedRow player1_row8 = new NamedRow(8);
        NamedRow player1_row9 = new NamedRow(9);

        // create iterable lists
        return new NamedRow[]{player1_row0, player1_row1, player1_row2, player1_row3, player1_row4,
                player1_row5, player1_row6, player1_row7, player1_row8, player1_row9};};

    // FUNCTION TO INITIALLY CREATE THE PLAYERS SHIPS; THIS IS NEVER CALLED AGAIN BEFORE GAME IS OVER
    public Ship[] createShipList(){
        Carrier player1_carriership = new Carrier();

        Battleship player1_battleship1 = new Battleship(); player1_battleship1.setShipName("Battleship 1");
        Battleship player1_battleship2 = new Battleship(); player1_battleship2.setShipName("Battleship 2");

        Submarine player1_submarine1 = new Submarine(); player1_submarine1.setShipName("Submarine 1");
        Submarine player1_submarine2 = new Submarine(); player1_submarine2.setShipName("Submarine 2");
        Submarine player1_submarine3 = new Submarine(); player1_submarine3.setShipName("Submarine 3");

        PatrolBoat player1_patrolBoat1 = new PatrolBoat(); player1_patrolBoat1.setShipName("PatrolBoat 1");
        PatrolBoat player1_patrolBoat2 = new PatrolBoat(); player1_patrolBoat2.setShipName("PatrolBoat 2");
        PatrolBoat player1_patrolBoat3 = new PatrolBoat(); player1_patrolBoat3.setShipName("PatrolBoat 3");
        PatrolBoat player1_patrolBoat4 = new PatrolBoat(); player1_patrolBoat4.setShipName("PatrolBoat 4");

        // cerate list with ships
        return new Ship[]{player1_carriership, player1_battleship1, player1_battleship2, player1_submarine1,
                player1_submarine2, player1_submarine3, player1_patrolBoat1,
                player1_patrolBoat2, player1_patrolBoat3, player1_patrolBoat4};}}



