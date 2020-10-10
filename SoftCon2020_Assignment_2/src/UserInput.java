package sample;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        /* Carrier */
        Scanner carrierScanner = new Scanner(System.in);
        System.out.println("Please enter the position of your Carrier: ");
        String CarrierPosition = carrierScanner.nextLine();

        if (CarrierPosition.charAt(1) == 0) {
            row1.setRowInstance(CarrierPosition, "C");
        }


        if (CarrierPosition.charAt(1) == 1) {
            row2.setRowInstance(CarrierPosition, "C");
        }

        if (CarrierPosition.charAt(1) == 2) {
            row3.setRowInstance(CarrierPosition, "C");
        }

        if (CarrierPosition.charAt(1) == 3) {
            row4.setRowInstance(CarrierPosition, "C");
        }

        if (CarrierPosition.charAt(1) == 4) {
            row5.setRowInstance(CarrierPosition, "C");
        }

        if (CarrierPosition.charAt(1) == 5) {
            row6.setRowInstance(CarrierPosition, "C");
        }

        if (CarrierPosition.charAt(1) == 6) {
            row7.setRowInstance(CarrierPosition, "C");
        }

        if (CarrierPosition.charAt(1) == 7) {
            row8.setRowInstance(CarrierPosition, "C");
        }

        if (CarrierPosition.charAt(1) == 8) {
            row9.setRowInstance(CarrierPosition, "C");
        }


        /* Battleship 1 */
        Scanner battleshipScanner = new Scanner(System.in);
        System.out.println("Please enter the position of your Battleship 1: ");
        String BattleshipPosition = battleshipScanner.nextLine();



        /* Battleship 2 */
        Scanner battleshipScanner_2 = new Scanner(System.in);
        System.out.println("Please enter the position of your Battleship 2: ");
        String BattleshipPosition_2 = battleshipScanner_2.nextLine();


        /* Submarine 1 */
        Scanner submarineScanner = new Scanner(System.in);
        System.out.println("Please enter the position of your Submarine 1: ");
        String SubmarinePosition = submarineScanner.nextLine();


        /* Submarine 2  */
        Scanner submarineScanner_2 = new Scanner(System.in);
        System.out.println("Please enter the position of your Submarine 2: ");
        String SubmarinePosition_2 = submarineScanner_2.nextLine();

        /* Submarine 3  */
        Scanner submarineScanner_3 = new Scanner(System.in);
        System.out.println("Please enter the position of your Submarine 3: ");
        String SubmarinePosition_3 = submarineScanner_3.nextLine();


        /* Patrol boat 1  */
        Scanner patrol_boatScanner = new Scanner(System.in);
        System.out.println("Please enter the position of your Patrol boat 1: ");
        String Patrol_boatPosition = patrol_boatScanner.nextLine();


        /* Patrol boat 2   */
        Scanner patrol_boatScanner_2 = new Scanner(System.in);
        System.out.println("Please enter the position of your Patrol boat 2: ");
        String Patrol_boatPosition_2 = patrol_boatScanner_2.nextLine();


        /* Patrol boat 3  */
        Scanner patrol_boatScanner_3 = new Scanner(System.in);
        System.out.println("Please enter the position of your Patrol boat 3: ");
        String Patrol_boatPosition_3 = patrol_boatScanner_3.nextLine();


        /* Patrol boat 4  */
        Scanner patrol_boatScanner_4 = new Scanner(System.in);
        System.out.println("Please enter the position of your Patrol boat 4: ");
        String Patrol_boatPosition_4 = patrol_boatScanner_4.nextLine();


    }
}
