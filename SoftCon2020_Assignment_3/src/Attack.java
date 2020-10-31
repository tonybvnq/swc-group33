
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
        rowList = attack_position(player,oponent, AttackCoordinates, inputrows);
    }

    public static NamedRow[] attack_position(Initialization player, Initialization oponent, String input, NamedRow[] rowList){


        char numOfInput =  input.charAt(1);
        int InputNum = Character.getNumericValue(numOfInput);
        char charOfInput = input.charAt(0);
        if (oponent.isInOccupiedSlots(input)) {
            rowList[InputNum].drawHitLetter(charOfInput,true);
            System.out.println("You hit a boat!");
            player.setShipcounter(player.getShipcounter()-1);
        }
        else {
            rowList[InputNum].drawHitLetter(charOfInput, false);
            System.out.println("Miss!");
        }

        return rowList;
    }


}