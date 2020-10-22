import java.util.*;
public class Main {


    // THE INPUT HAS TO BE IN FORM A1 A5
    // LIKE IN PDF OF ASSIGNMENT 2, RESPECT SPACE BETWEEN COORDINATES AND UPPERCASE
    // THE NUMBERS AND LETTERS CAN BE DESCENDING E.G. A5 A1 OR C1 A1



    // stores the occupied slots of the board
    private static List<String> occupiedslots = new ArrayList<String>();

    public static Boolean isInOccupiedSlots(String coordinate){
        return occupiedslots.contains(coordinate);
    };

    public static List<String> getOccupiedSlots(){
        return occupiedslots;
    };


    public static void setOccupiedslots(String coordinate){
        occupiedslots.add(coordinate);
    };

    public static void main(String[] args)  {
        System.out.println("Welcome to Battleship!!");

        //**Initialize**

        // COMPUTER PLAYER INITIALIZATION & POSITIONING

        ComputerPlayerInitialization computerinit1 = ComputerPlayerInitialization.getInitialization();
        NamedRow[] computerplayer_rowList = computerinit1.returnRowList();
        Ship[] computerplayer_shipList = computerinit1.returnShipList();

        // RANDOM POSITIONING



        // PLAYER 1 INITALIZATION & POSITIONING

        // get a list with the players ships and the rows of his battlefield
        PlayerInitialization playerInit1 = PlayerInitialization.getInitialization();
        NamedRow[] player1_rowList = playerInit1.returnRowList();
        Ship[] player1_shipList = playerInit1.returnShipList();

        // creates hashtable in form shipname : coorrdinates
        Hashtable<String, ArrayList<String>> player1_shipcoordinates = new Hashtable<String, ArrayList<String>>();
        for (Ship s : player1_shipList){
            player1_shipcoordinates.put(s.getShipname(), s.getShipCoordinates());
        }

        // iterate through ships
        // asks for input and assigns to positioning on board as long as amount of certain ship doesnt reach 0
        // checks if slots are occupied
        // repeat for every ship
        for (Ship e : player1_shipList){
            while (e.getShipAmount() > 0){
                String[] coordinates = InputGetter.askPlacement(e);
                String startcoordinate = coordinates[0];
                String endcoordinate = coordinates[1];
                    e.setShip(startcoordinate, endcoordinate, player1_rowList);

    }};



        // FIGHTING PHASE

        // WHEN EITHER COUNTER HITS 0, THE GAME IS OVER
        int player_count = player1_shipList.length;
        int computerplayer_count = player1_shipList.length;
        int destroyedshipsyplayer = 0;

        //**Command line output**
        //Assemble rows and lists and print filled board
        System.out.println("Your board");
        OutputAssembler.printBoard(player1_rowList);
        System.out.println("Your oponents board");
        OutputAssembler.printBoard(computerplayer_rowList);
        OutputAssembler.printScoreboard(player_count, destroyedshipsyplayer);


    }}


