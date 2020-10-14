import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
//calls positioning class

public class InputGetter {
    public static String[] askPlacement() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter the position of your :");

        String returnedShipPlacement = myObj.nextLine();  // Read user input

        String[] listOfPlaces = returnedShipPlacement.split(" ");
        System.out.println(Arrays.toString(listOfPlaces));

        return listOfPlaces;
    }

}