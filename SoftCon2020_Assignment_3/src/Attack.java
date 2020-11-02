
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class Attack {
    NamedRow[] rowList;

    public Attack(Initialization player, Initialization oponent, NamedRow[] inputrows, boolean isComputer) {
        String AttackCoordinates;
        if (isComputer){
            AttackCoordinates = RandomCoordinateGenerator.getRandomCoordinate();
        }else {
            AttackCoordinates = InputGetter.askAttackPlacement(player);
        }
        rowList = attack_position(player,oponent, AttackCoordinates, inputrows, isComputer);
    }

    public static NamedRow[] attack_position(Initialization player, Initialization oponent, String input, NamedRow[] rowList, boolean isComputer){


        char numOfInput =  input.charAt(1);
        int InputNum = Character.getNumericValue(numOfInput);
        char charOfInput = input.charAt(0);
        if (isComputer) {
            System.out.println("The computer attacks position " + input);
        }
        if (oponent.isInOccupiedSlots(input)) {
            rowList[InputNum].drawHitLetter(charOfInput,true);
            if (!isComputer){
                System.out.println("You hit a boat!");
            }else{
                System.out.println("Your boat was hit!");
            }
            player.setShipcounter(player.getShipcounter()-1);
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