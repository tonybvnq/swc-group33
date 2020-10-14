import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Battleship!!");

        //**Initialize**
        //Create and maintain rows with Lists
        // create all rows empty -> Are we supposed to use setters here because encapsulation stuff??
        NamedRow row1 = new NamedRow(1);
        NamedRow row2 = new NamedRow(2);
        NamedRow row3 = new NamedRow(3);
        NamedRow row4 = new NamedRow(4);
        NamedRow row5 = new NamedRow(5);
        NamedRow row6 = new NamedRow(6);
        NamedRow row7 = new NamedRow(7);
        NamedRow row8 = new NamedRow(8);
        NamedRow row9 = new NamedRow(9);

        Row[] rowList = new Row[]{row1, row2, row3, row4, row5, row6, row7, row8, row9};

    /*    row5.drawShipLetter('F', 'P');
        row5.drawShipLetter('G', 'R');
        row5.drawShipLetter('H', 'P');*/

        //Get status of specific row
            //Set ship in specific row

        //Create Ships
            //Get length of ship
            //Get letter of ship
            //Get amount of ship type
            //Get list of all ships


        //**User Input**

        //Test Input getter
        InputGetter.askPlacement("Battleship");

        //x10
        //Ask User for placement of each ship
            //Check if inside of board

        //Check ship placement
            //Check length of ship
            //Check status of specific rows

        //Place ship in rows(s)
            //Set letter of ship in row(s))

        //**Command line output**
        //Assemble rows and lists and print filled board


        OutputAssembler board = new OutputAssembler(rowList);
        board.printBoard();



    }
}

