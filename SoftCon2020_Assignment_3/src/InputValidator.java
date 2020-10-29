
public class InputValidator {
    public static boolean getValidity (String[] listOfPlaces, Ship ship){

        boolean inputIsValid = false;
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
        return inputIsValid;
    }

    public static boolean getAttackValidity(Initialization player, String AttackPosition) {
        boolean inputIsValid = false;
        String ycoordinates = "ABCDEFGHIJ";
        String xcoordinates = "0123456789";
        char firstChar = AttackPosition.charAt(0);
        char secondChar = AttackPosition.charAt(1);

        if (player.isInHitSlots(AttackPosition)){
            System.out.println("You already attacked this spot");
            return inputIsValid;
        }

        if (AttackPosition.length() == 2
                && ycoordinates.indexOf(firstChar) != -1
                && xcoordinates.indexOf(secondChar) != -1) {
            inputIsValid = true;
            player.setHitSlots(AttackPosition);
        }


        return inputIsValid;

    }
}