public class Testing {


    // class for exception thrown when ther is already a ship at input
   public static class OccupiedException extends Exception{
       public OccupiedException(String errorMsg){
           super(errorMsg);
       }
    }

    // test if x-coordinate (letter) is out of bounds
    public static void testXCoordinate(int xcoordinate, char xletter){
        if (xcoordinate == 0){
            throw new IndexOutOfBoundsException("x coordinate" + xletter + "is out bounds");
        }
    }

    // test if slot in row is already occupied by a ship
    public static void testIfOccupied(char slot) throws OccupiedException {
        // need " " as char for comparison
        String freeslot= " ";
        char freechar = freeslot.charAt(0);

        if (slot != freechar){
            throw new OccupiedException("There is alreasy a ship at this slot!");
        }
    }
}
