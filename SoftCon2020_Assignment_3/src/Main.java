import java.util.*;
public class Main {


    // THE INPUT HAS TO BE IN FORM A1 A5
    // LIKE IN PDF OF ASSIGNMENT 2, RESPECT SPACE BETWEEN COORDINATES AND UPPERCASE
    // THE NUMBERS AND LETTERS CAN BE DESCENDING E.G. A5 A1 OR C1 A1



    public static void main(String[] args)  {
        System.out.println("Welcome to Battleship!!");

        //**Initialize**

        // COMPUTER PLAYER INITIALIZATION

        ComputerPlayerInitialization computerinit1 = ComputerPlayerInitialization.getInitialization();

        // FIRST INITALIZATION OF LISTS
        NamedRow[] computerplayer_rowList = computerinit1.getRowList();
        Ship[] computerplayer_shipList = computerinit1.getShipList();

        // RANDOM POSITIONING



        // PLAYER 1 INITALIZATION & POSITIONING

        // get a list with the players ships and the rows of his battlefield
        PlayerInitialization playerInit1 = PlayerInitialization.getInitialization();

        // FIRST INITALIZATION OF LISTS
        NamedRow[] player1_rowList = playerInit1.getRowList();
        Ship[] player1_shipList = playerInit1.getShipList();

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
                String[] coordinates = InputGetter.askPlacement(e);
                String startcoordinate = coordinates[0];
                String endcoordinate = coordinates[1];
                    e.setShip(playerInit1, startcoordinate, endcoordinate, player1_rowList);

    };

        // FIGHTING PHASE

       Attack player1_attackphase = new Attack(playerInit1, player1_rowList);


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


