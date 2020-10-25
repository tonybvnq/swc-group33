import javax.naming.Name;
import java.util.*;


public abstract class  OutputAssembler {

    // removed static keyword
    public static  void printBoard(NamedRow[] rowList) {
        System.out.println("   |[A][B][C][D][E][F][G][H][I][J]");
        System.out.println("---|------------------------------");
        for (NamedRow row : rowList){
            row.printRow(); } }

    public static void printScoreboard(int remainingships, int destroyedships ){
        System.out.println("Your scoureboard: ");
        System.out.println(" -  Player remaining boats:" + remainingships);
        System.out.println(" -  Enemy boats destroyed:" + destroyedships);

    };}

