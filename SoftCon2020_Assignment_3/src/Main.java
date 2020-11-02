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

        // iterate through ships
        // asks for input and assigns to positioning on board as long as amount of certain ship doesnt reach 0
        // checks if slots are occupied
        // repeat for every ship

        for (Ship e1 : computerplayer_shipList) {
            while (true){
                try{
                    String[] coordinates = RandomShipPlacer.placeShipRandomly(e1);
                    String startcoordinate = coordinates[0];
                    String endcoordinate = coordinates[1];
                    e1.setShip(computerinit1, startcoordinate, endcoordinate, computerplayer_rowList, true);
                    break;
                }catch(Exception e){
                    continue;
                }
            }
        }
        // creates hashtable in form shipname : coorrdinates
        Hashtable<String, ArrayList<String>> computer_shipcoordinates = new Hashtable<String, ArrayList<String>>();
        for (Ship s : computerplayer_shipList){
            computer_shipcoordinates.put(s.getShipname(), s.getShipCoordinates());
        }
        //Test Computer board
        //OutputAssembler.printBoard(computerplayer_rowList);



        // PLAYER 1 INITALIZATION & POSITIONING

        // get a list with the players ships and the rows of his battlefield
        PlayerInitialization playerInit1 = PlayerInitialization.getInitialization();

        // FIRST INITALIZATION OF LISTS
        NamedRow[] player1_rowList = playerInit1.getRowList();
        Ship[] player1_shipList = playerInit1.getShipList();



        // iterate through ships
        // asks for input and assigns to positioning on board as long as amount of certain ship doesnt reach 0
        // checks if slots are occupied
        // repeat for every ship
        for (Ship e1 : player1_shipList) {
            while (true){
                try{
                    String[] coordinates = InputGetter.askPlacement(e1);
                    String startcoordinate = coordinates[0];
                    String endcoordinate = coordinates[1];
                    e1.setShip(playerInit1, startcoordinate, endcoordinate, player1_rowList, false);
                    break;
                }catch(Exception e){
                    continue;
                }
            }
        }
        // creates hashtable in form shipname : coorrdinates
        Hashtable<String, ArrayList<String>> player1_shipcoordinates = new Hashtable<String, ArrayList<String>>();
        for (Ship s : player1_shipList){
            player1_shipcoordinates.put(s.getShipname(), s.getShipCoordinates());
        }


        // FIGHTING PHASE

        // WHEN EITHER COUNTER HITS 0, THE GAME IS OVER
        while (player1_shipcoordinates.size() != 0 && computer_shipcoordinates.size() != 0){
            Attack player1_attackphase = new Attack(playerInit1, computerinit1, computer_shipcoordinates, computerplayer_rowList, false);
            Attack computerplayer_attackphase = new Attack(computerinit1, playerInit1, player1_shipcoordinates, player1_rowList, true);

            //**Command line output**
            //Assemble rows and lists and print filled board
            System.out.println("Your board");
            OutputAssembler.printBoard(player1_rowList);
            System.out.println("Your opponents board");
            OutputAssembler.printBoard(computerplayer_rowList);
            OutputAssembler.printScoreboard(player1_shipcoordinates.size(),
                    (10 - computer_shipcoordinates.size()));
        }

        if (player1_shipcoordinates.size() == 0){
            System.out.println("Sorry, you lost");
        }
        else {System.out.println("congratulations, you won");}



    }}


