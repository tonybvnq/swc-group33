import java.util.ArrayList;
import java.util.List;

public class Positioning {
    // takes the user input, the letter of the ship and all the rows as input
    // gives back the changed rows
    public static NamedRow[] position(Initialization player, Ship ship, String input1, String input2, char shipletter, NamedRow[] rowList)
            throws Exception {


        // if input goes from right to left or down to up, swap inputs
        if (Integer.parseInt(String.valueOf(input1.charAt(1))) > Integer.parseInt(String.valueOf(input2.charAt(1)))
                || (int) input1.charAt(0) > (int) input2.charAt(0)){
            String temp = input1;
            input1 = input2;
            input2 = temp;
        }

        String ycoordinates = "ABCDEFGHIJ";
        int numOfInput1 =  Integer.parseInt(String.valueOf(input1.charAt(1)));
        int numOfInput2 =  Integer.parseInt(String.valueOf(input2.charAt(1)));
        ArrayList<Integer> dexList = new ArrayList<Integer>();
        boolean valid = true;

        // if the x coordinate is same, e.g. E5 E8
        if (input1.charAt(0) == input2.charAt(0)) {
            int dex = numOfInput1;
            while( dex <= numOfInput2){
                // check if field is in occupedfields, if not, add to list and write in row
                String field = new StringBuilder().append(input1.charAt(0)).append(dex).toString();
                if (player.isInOccupiedSlots(field)){ System.out.println("There is already a ship at this slot!");
                    valid = false; throw new Exception();};
                player.setOccupiedslots(field);


                // draws shipletter into row
                dexList.add(dex);
                dex ++;

            }
            if (valid){
                StringBuilder coordinates = new StringBuilder();
                for (int i : dexList){
                    String ic = Integer.toString(i);
                    coordinates.append(input1.charAt(0));
                    coordinates.append(ic);
                    rowList[i].drawShipLetter(input1.charAt(0), shipletter);
                }
                ship.setShipCoordinates(coordinates.toString());}
        }
        // if the Y coordinate is same e.g B3 F3
        else {
            int dex1 = ycoordinates.indexOf(input1.charAt(0));
            int dex2 = ycoordinates.indexOf(input2.charAt(0));

            while (dex1 <= dex2){
                // check if field is in occupedfields, if not, add to list and write in row
                String field = new StringBuilder().append(ycoordinates.charAt(dex1)).append(numOfInput1).toString();
                if (player.isInOccupiedSlots(field)){ System.out.println("There is already a ship at this slot!");
                    valid = false; throw new Exception();};
                player.setOccupiedslots(field);

                // draws shipletter into row
                dexList.add(dex1);
                dex1 ++;
            }

            if (valid){
                StringBuilder coordinates = new StringBuilder();
                for (int i : dexList){
                    String numc = Integer.toString(numOfInput1);
                    coordinates.append(ycoordinates.charAt(i));
                    coordinates.append(numc);
                    rowList[numOfInput1].drawShipLetter(ycoordinates.charAt(i), shipletter);
                }
                ship.setShipCoordinates(coordinates.toString());
            }
        }
        return rowList;
    }}