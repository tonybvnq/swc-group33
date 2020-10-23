
import java.util.concurrent.ThreadLocalRandom;


public class RandomCoordinateGenerator {
    public static String getRandomCoordinate(){
        String xCoordinates = "0123456789";
        String yCoordinates = "ABCDEFGHIJ";

        int randomXInt = ThreadLocalRandom
                .current()
                .nextInt(0, 9 + 1);
        int randomYInt = ThreadLocalRandom
                .current()
                .nextInt(0, 9 + 1);

        char randomXValue = xCoordinates.charAt(randomXInt);
        char randomYValue = yCoordinates.charAt(randomYInt);

        //System.out.println(""+randomYValue + randomXValue);

        return ""+randomYValue + randomXValue;
    }
}