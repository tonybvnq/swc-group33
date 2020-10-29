import java.util.*;

public class RandomShipPlacer {
    public static String[] placeShipRandomly (Ship ship){
        String[] place = new String[2];
        String endpoint;
        char endPoint1 = 'a';
        char endPoint2 = 'a';
        boolean isValid = false;
        int shipLength = ship.getShipLength();
        String yCoordinates = "0123456789";
        String xCoordinates = "ABCDEFGHIJ";

        //random whether vertical or horizontal
        Random random = new Random();
        boolean isVertical = random.nextBoolean();
        String startPoint = RandomCoordinateGenerator.getRandomCoordinate();

        while (!isValid){
            startPoint = RandomCoordinateGenerator.getRandomCoordinate();
            if (isVertical){
                endPoint2 = startPoint.charAt(1);
                if ((shipLength + xCoordinates.indexOf(startPoint.charAt(0))-1) <= 9){
                    isValid = true;
                    endPoint1 = xCoordinates.charAt(shipLength + xCoordinates.indexOf(startPoint.charAt(0))-1);
                }

            }else {
                endPoint1 = startPoint.charAt(0);
                int indexCreated = shipLength + yCoordinates.indexOf(startPoint.charAt(1))-1;
                //System.out.println(indexCreated);
                if (indexCreated > 9){
                    isValid = false;
                }else{
                    isValid = true;
                    endPoint2 = yCoordinates.charAt(indexCreated);
                }
            }
        }
        endpoint = ""+endPoint1 + endPoint2;
        place[0] = startPoint;
        place[1] = endpoint;
        //System.out.println(String.join(" ", place));
        return place;

    }
}