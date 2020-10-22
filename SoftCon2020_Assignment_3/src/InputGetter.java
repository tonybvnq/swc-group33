<<<<<<< HEAD
=======

>>>>>>> ebd86eedaa604bc5fe17acab9e1fb61a64269532
import java.util.Scanner;
import java.util.Arrays;


public class InputGetter {
    public static String[] askPlacement(Ship ship) {
        Boolean inputIsValid = false;
        String[] listOfPlaces = new String[2];
<<<<<<< HEAD

        while (!inputIsValid) {
            //get input
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            String question = String.format("Please enter the position of your %s:", ship.shipletter); //Create question
            System.out.println(question); //Print question
            String returnedShipPlacement = myObj.nextLine();  // Read user input
            listOfPlaces = returnedShipPlacement.split(" "); //Separate user input into array

            String firstEntry = listOfPlaces[0];
            String secondEntry = listOfPlaces[1];
            String ycoordinates = "ABCDEFGHIL";
            String xcoordinates = "0123456789";
            char firstEntryx = firstEntry.charAt(0);
            char secondEntryx = secondEntry.charAt(0);
            char firstEntryy = firstEntry.charAt(1);
            char secondEntryy = secondEntry.charAt(1);
            int numE1x = firstEntryx;
            int numE2x = secondEntryx;
            int numE1y = firstEntryy;
            int numE2y = secondEntryy;

            //Test whether out of board
            if (ycoordinates.indexOf(firstEntryx) != -1
                    && ycoordinates.indexOf(secondEntryx) != -1
                    && xcoordinates.indexOf(firstEntryy) != -1
                    && xcoordinates.indexOf(secondEntryy) != -1) {
                inputIsValid = true;
            }
            if (!inputIsValid) {
                System.out.println("Chosen coordinates are outside of board!!! Please try again");
            }
            //Test whether length is correct
            int length = ship.length;

            if ((firstEntryx == secondEntryx && (numE2y - numE1y) == length)
                    || (firstEntryy == secondEntryy && (numE2x - numE1x) == length)) {
                inputIsValid = true;
            } else {
                inputIsValid = false;
            }
            if (!inputIsValid) {
                System.out.println("Coordinates do not fit length of ship!!! Please try again");
            }

=======

        while (!inputIsValid) {
            //get input
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            String question = String.format("Please enter the position of your %s:", ship.getShipname()); //Create question
            System.out.println(question); //Print question
            String returnedShipPlacement = myObj.nextLine();  // Read user input
            listOfPlaces = returnedShipPlacement.split(" "); //Separate user input into array

            String firstEntry = listOfPlaces[0];
            String secondEntry = listOfPlaces[1];
            String ycoordinates = "ABCDEFGHIJ";
            String xcoordinates = "0123456789";
            char firstEntryx = firstEntry.charAt(0);
            char secondEntryx = secondEntry.charAt(0);
            char firstEntryy = firstEntry.charAt(1);
            char secondEntryy = secondEntry.charAt(1);
            int numE1x = firstEntryx;
            int numE2x = secondEntryx;
            int numE1y = firstEntryy;
            int numE2y = secondEntryy;

            //Test whether out of board
            if (ycoordinates.indexOf(firstEntryx) != -1
                    && ycoordinates.indexOf(secondEntryx) != -1
                    && xcoordinates.indexOf(firstEntryy) != -1
                    && xcoordinates.indexOf(secondEntryy) != -1) {
                inputIsValid = true;
            }
            if (!inputIsValid) {
                System.out.println("Specified input is invalid");
            }
            //Test whether length is correct
            int length = ship.getShipLength();

            if ((firstEntryx == secondEntryx && (numE2y - numE1y + 1) == length)
                    || (firstEntryy == secondEntryy && (numE2x - numE1x + 1) == length)) {
                inputIsValid = true;
            } else {
                inputIsValid = false;
            }
            if (!inputIsValid) {
                System.out.println("Specified input is invalid");
            }

>>>>>>> ebd86eedaa604bc5fe17acab9e1fb61a64269532
        }
        return listOfPlaces;
    }

}