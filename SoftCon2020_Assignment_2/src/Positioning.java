import java.util.List;

public class Positioning {
        // takes the user input, the letter og the ship and all the rows as input
        // gives back the changed rows
    public Row[] position(String input1, String input2, char shipletter, Row[] rowList){
        String ycoordinates = "ABCDEFGHIL";


        // if input goes from right to left or down to up, swap inputs
        // int ascii1 = (int) input1.charAt(0);
        // int ascii2 = (int) input2.charAt(0);

        if (input1.charAt(1) > input2.charAt(1) && (int) input1.charAt(0) > (int) input2.charAt(0)){
            String temp = input1;
            input1 = input2;
            input2 = temp;
        }
        // if the x coordinate is same, e.g. E5 E8
        if (input1.charAt(0) == input2.charAt(0)) {
            int dex = input1.charAt(1);
            while( dex <= input2.charAt(1)){
                rowList[dex-1].drawShipLetter(input1.charAt(0), shipletter);
            } }
        // if the Y coordinate is same e.g B3 F3
        else {
            // StringBuilder drawlettersbuild = new StringBuilder();
            int dex1 = ycoordinates.indexOf(input1.charAt(0));
            int dex2 = ycoordinates.indexOf(input2.charAt(0));

            while (dex1 <= dex2){
                rowList[input1.charAt(1)-1].drawShipLetter(ycoordinates.charAt(dex1), shipletter);
                //drawlettersbuild.append(letters.charAt(dex1));
                // String drawletters = drawlettersbuild.toString();
                dex1 ++;
            }
        }
        return rowList;
    }}
