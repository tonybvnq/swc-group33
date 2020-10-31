import java.util.ArrayList;
import java.util.List;

public class ComputerPlayerInitialization extends Initialization{

    // SINGLETON
    // COMPUTER INITIALIZATION SHOULD REMAIN THE ONLY OF ITS KIND, WE CREATE ONE AND NO MORE, IT REMAINS A SINGLETON

    private static ComputerPlayerInitialization computerinit;

    private static List<String> computerplayer_occupiedslots = new ArrayList<String>();

    private ComputerPlayerInitialization(){
        createPlayersOccupiedSlotsList(computerplayer_occupiedslots);
        setRowList(createRowList());
        setShiplist(createShipList());
        setShipcounter(this.getShipList().length);
    };


    // CREATES THE ONLY SINGELTON OF THIS OBJECT
    public static ComputerPlayerInitialization getInitialization(){
        if (computerinit == null){
            return new ComputerPlayerInitialization();
        }
        return computerinit;
    }

    // FUNCTION TO INITIALLY CREATE THE PLAYERS BATTLEFIELD; THIS IS NEVER CALLED AGAIN BEFORE GAME IS OVER
    public NamedRow[] createRowList(){
        NamedRow computerplayer_row0 = new NamedRow(0);
        NamedRow computerplayer_row1 = new NamedRow(1);
        NamedRow computerplayer_row2 = new NamedRow(2);
        NamedRow computerplayer_row3 = new NamedRow(3);
        NamedRow computerplayer_row4 = new NamedRow(4);
        NamedRow computerplayer_row5 = new NamedRow(5);
        NamedRow computerplayer_row6 = new NamedRow(6);
        NamedRow computerplayer_row7 = new NamedRow(7);
        NamedRow computerplayer_row8 = new NamedRow(8);
        NamedRow computerplayer_row9 = new NamedRow(9);

        // create iterable lists
        return new NamedRow[]{computerplayer_row0, computerplayer_row1, computerplayer_row2, computerplayer_row3, computerplayer_row4,
                computerplayer_row5, computerplayer_row6, computerplayer_row7, computerplayer_row8, computerplayer_row9};};

    // FUNCTION TO INITIALLY CREATE THE PLAYERS SHIPS; THIS IS NEVER CALLED AGAIN BEFORE GAME IS OVER
    public Ship[] createShipList(){
        Carrier computerplayer_carriership = new Carrier();

        Battleship computerplayer_battleship1 = new Battleship(); computerplayer_battleship1.setShipName("Battleship 1");
        Battleship computerplayer_battleship2 = new Battleship(); computerplayer_battleship2.setShipName("Battleship 2");

        Submarine computerplayer_submarine1 = new Submarine(); computerplayer_submarine1.setShipName("Submarine 1");
        Submarine computerplayer_submarine2 = new Submarine(); computerplayer_submarine2.setShipName("Submarine 2");
        Submarine computerplayer_submarine3 = new Submarine(); computerplayer_submarine3.setShipName("Submarine 3");

        PatrolBoat computerplayer_patrolBoat1 = new PatrolBoat(); computerplayer_patrolBoat1.setShipName("PatrolBoat 1");
        PatrolBoat computerplayer_patrolBoat2 = new PatrolBoat(); computerplayer_patrolBoat2.setShipName("PatrolBoat 2");
        PatrolBoat computerplayer_patrolBoat3 = new PatrolBoat(); computerplayer_patrolBoat3.setShipName("PatrolBoat 3");
        PatrolBoat computerplayer_patrolBoat4 = new PatrolBoat(); computerplayer_patrolBoat4.setShipName("PatrolBoat 4");

        // cerate list with ships
        return new Ship[]{computerplayer_carriership, computerplayer_battleship1, computerplayer_battleship2,
                computerplayer_submarine1, computerplayer_submarine2,
                computerplayer_submarine3, computerplayer_patrolBoat1, computerplayer_patrolBoat2,
                computerplayer_patrolBoat3, computerplayer_patrolBoat4};}
}
