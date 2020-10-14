import java.util.*;
public class Main {
    static List<String> inputs = new ArrayList<String>();

    public static void main(String[] args)  {
        System.out.println("Welcome to Battleship!!");

        //**Initialize**
        //Create and maintain rows with Lists
        // create ships as objects
        NamedRow row1 = new NamedRow(1);
        NamedRow row2 = new NamedRow(2);
        NamedRow row3 = new NamedRow(3);
        NamedRow row4 = new NamedRow(4);
        NamedRow row5 = new NamedRow(5);
        NamedRow row6 = new NamedRow(6);
        NamedRow row7 = new NamedRow(7);
        NamedRow row8 = new NamedRow(8);
        NamedRow row9 = new NamedRow(9);
        Carrier carriership = new Carrier();
        Battleship battleship = new Battleship();
        Submarine submarine = new Submarine();
        PatrolBoat patrolBoat = new PatrolBoat();


        // create iterable lists for rows and ships and inputs
        NamedRow[] rowList = new NamedRow[]{row1, row2, row3, row4, row5, row6, row7, row8, row9};
        Ship[] shipList = new Ship[]{carriership, battleship, submarine, patrolBoat};


        // iterate through ships
        // asks for input and assigns to positioning on board as long as amount of certain ship doesnt reach 0
        // repeat for every ship
        for (Ship e : shipList){
            while (e.getShipAmount() > 0){
                String[] coordinates = InputGetter.askPlacement(e.getShipname());
                String startcoordinate = coordinates[0];
                String endcoordinate = coordinates[1];
                if (inputs.contains(startcoordinate) || inputs.contains(endcoordinate)) {
                    System.out.println("There is alreasy a ship at this slot!");
                }else {
                    inputs.add(startcoordinate);
                    inputs.add(endcoordinate);
                    e.setShip(startcoordinate, endcoordinate, rowList);}


    }};

        //Place ship in rows(s)
            //Set letter of ship in row(s))

        //**Command line output**
        //Assemble rows and lists and print filled board
        OutputAssembler board = new OutputAssembler(rowList);
        board.printBoard();



    }
}

