import java.util.Scanner;

public class InputGetter {
    public askPlacement() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter the position of your :");

        String returnedShipPlacement = myObj.nextLine();  // Read user input
    }

}
