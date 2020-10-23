
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;


public class InputGetter {
    public static String[] askPlacement(Ship ship) {
        Boolean inputIsValid = false;
        String[] listOfPlaces = new String[2];

        while (!inputIsValid) {
            //get input
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            String question = String.format("Please enter the position of your %s:", ship.getShipname()); //Create question
            System.out.println(question); //Print question
            String returnedShipPlacement = myObj.nextLine();  // Read user input
            listOfPlaces = returnedShipPlacement.split(" "); //Separate user input into array
            inputIsValid = InputValidator.getValidity(listOfPlaces, ship); //check validity of input

        }
        return listOfPlaces;
    }

    public static String askAttackPlacement() {
        Boolean inputIsValid = false;
        String AttackPosition = "new String[2]";
        while (!inputIsValid) {
            Scanner pos = new Scanner(System.in);  // Create a Scanner object
            String question = "Enter the position you want to attack:"; //Create question
            System.out.println(question); //Print question
            AttackPosition = pos.nextLine();
            inputIsValid = InputValidator.getAttackValidity(AttackPosition);  //Check if input is valid

        }
        return AttackPosition;
    }

}