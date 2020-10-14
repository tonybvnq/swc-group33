import java.util.Scanner;
import java.util.Arrays;


public class InputGetter {
    public static String[] askPlacement(String shipName) {
        Boolean inputIsValid = false;
        String[] listOfPlaces = new String[2];

        while (!inputIsValid) {
            //get input
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            String question = String.format("Please enter the position of your %s:", shipName); //Create question
            System.out.println(question); //Print question
            String returnedShipPlacement = myObj.nextLine();  // Read user input
            listOfPlaces = returnedShipPlacement.split(" "); //Separate user input into array

            String firstEntry = listOfPlaces[1];
            String secondEntry = listOfPlaces[2];
            String ycoordinates = "ABCDEFGHIL";
            String xcoordinates = "0123456789";

            //Test whether out of board
            if (ycoordinates.indexOf(firstEntry.charAt(0))!=-1 && ycoordinates.indexOf(secondEntry.charAt(0))!=-1) {
                inputIsValid = true;
            }
            if (xcoordinates.indexOf(firstEntry.charAt(0))!=-1 && xcoordinates.indexOf(secondEntry.charAt(0))!=-1) {
                inputIsValid = true;
            } else {
                inputIsValid = false;
            }

            //Test whether length is correct


        }

        //Test
        System.out.println(Arrays.toString(listOfPlaces));

        return listOfPlaces;
    }

}