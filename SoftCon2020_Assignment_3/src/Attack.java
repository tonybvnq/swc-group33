
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class Attack {
    NamedRow[] rowList;

    public Attack(Initialization player, NamedRow[] inputrows) {
        String AttackCoordinates = InputGetter.askAttackPlacement();
        rowList = attack_position(player, AttackCoordinates, inputrows);
    }

    public static NamedRow[] attack_position(Initialization player, String input, NamedRow[] rowList){
        char numOfInput =  input.charAt(1);
        int InputNum = Character.getNumericValue(numOfInput);
        char charOfInput = input.charAt(0);
        if (player.isInOccupiedSlots(input)) {
            rowList[InputNum].drawHitLetter(charOfInput,true);
            System.out.println("You hit a boat!");
        }
        else {
            rowList[InputNum].drawHitLetter(charOfInput, false);
            System.out.println("Miss!");
        }

        return rowList;
    }


}