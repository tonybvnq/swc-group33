import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;


public class InputGetter {
    public static String[] askPlacement(String shipName) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String question = String.format("Please enter the position of your %s:", shipName); //Create question
        System.out.println(question); //Print question
        String returnedShipPlacement = myObj.nextLine();  // Read user input
        String[] listOfPlaces = returnedShipPlacement.split(" "); //Separate user input into array

        //Test
        System.out.println(Arrays.toString(listOfPlaces));

        return listOfPlaces;
    }

}