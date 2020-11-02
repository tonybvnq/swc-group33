
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map.Entry;

public class Attack {
    NamedRow[] rowList;

    public Attack(Initialization player, Initialization oponent, Hashtable shipccordnates,NamedRow[] inputrows, boolean isComputer) {
        String AttackCoordinates;
        if (isComputer){
            AttackCoordinates = RandomCoordinateGenerator.getRandomCoordinate();
        }else {
            AttackCoordinates = InputGetter.askAttackPlacement(player);
        }
        rowList = attack_position(player,oponent, shipccordnates, AttackCoordinates, inputrows, isComputer);
    }

    public static NamedRow[] attack_position(Initialization player, Initialization oponent, Hashtable<String, ArrayList<String>> shipccordnates, String input, NamedRow[] rowList, boolean isComputer){


        char numOfInput =  input.charAt(1);
        int InputNum = Character.getNumericValue(numOfInput);
        char charOfInput = input.charAt(0);
        if (oponent.isInOccupiedSlots(input)) {
            rowList[InputNum].drawHitLetter(charOfInput,true);
            if (!isComputer){
                System.out.println("You hit a boat!");
                String key = null;
                boolean destroyed = false;

                // LOOKS FOR THE KEY VALUE PAIR WHICH CONSITS THE INPUT COORDINATE IN THE VALUE
                // REPLACES THE COORDNINATE WITH EMPTY SPACE
                for (ArrayList<String> value: shipccordnates.values()) {
                    if (value.get(0).contains(input)){
                        String newVal = value.get(0).replace(input, "");
                        value.set(0, newVal);
                        if (value.get(0).equals("")){
                            // IF THE VALUE IS NOTHING BUT EMPTY SPACE, DELETE ITS KEY (SHIP) AND GIVE PROMPT FEEDBACK
                            for (Entry<String, ArrayList<String>> entry: shipccordnates.entrySet()){
                                if (entry.getValue().get(0).equals("")){
                                    System.out.println("You destroyed the enemy " + entry.getKey());
                                    key = entry.getKey();
                                    destroyed = true;
                                    break;} } }
                    } }
                if (destroyed){shipccordnates.remove(key);}
                oponent.setShipcounter(oponent.getShipcounter()-1);}
            else{
                System.out.println("Your boat was hit!");
                String key = null;
                boolean destroyed = false;

                // LOOKS FOR THE KEY VALUE PAIR WHICH CONSITS THE INPUT COORDINATE IN THE VALUE
                // REPLACES THE COORDNINATE WITH EMPTY SPACE
                for (ArrayList<String> value: shipccordnates.values()) {
                    if (value.get(0).contains(input)){
                        String newVal = value.get(0).replace(input, "");
                        value.set(0, newVal);
                        if (value.get(0).equals("")){
                            // IF THE VALUE IS NOTHING BUT EMPTY SPACE, DELETE ITS KEY (SHIP) AND GIVE PROMPT FEEDBACK
                            for (Entry<String, ArrayList<String>> entry: shipccordnates.entrySet()){
                                if (entry.getValue().get(0).equals("")){
                                    System.out.println("Your " + entry.getKey() + "was destroyed!");
                                    key = entry.getKey();
                                    destroyed = true;
                                    break;} } }
                    } }
                if (destroyed){shipccordnates.remove(key);}
                oponent.setShipcounter(oponent.getShipcounter()-1);}


        }
        else {
            rowList[InputNum].drawHitLetter(charOfInput, false);
            if (!isComputer) {
                System.out.println("Miss!");
            }else{
                System.out.println("The computer missed!");
            }
        }

        return rowList;
    }
}