public class Testing {

        // class for exception thrown when ther is already a ship at input
        public static class OccupiedException extends Exception{

            // override stacktrace because we dont want it
            @Override
            public Throwable fillInStackTrace()
            {
                return this;}
            public OccupiedException(String errorMsg){
                super(errorMsg);
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

