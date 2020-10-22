import javax.naming.Name;
import java.util.*;


public class OutputAssembler {
    NamedRow[] rowList;
    int remainingships;
    int destroyedships;

    public OutputAssembler(NamedRow[] inputrows){
        rowList = inputrows;
    }

    // removed static keyword
    public  void printBoard() {
        System.out.println("   |[A][B][C][D][E][F][G][H][I][J]");
        System.out.println("---|------------------------------");
        for (NamedRow row : this.rowList){
            row.printRow(); } }

    public void printScoreboard(){
        System.out.println("Your scoureboard: ");
        System.out.println(" -  Player remaining boats: %d", remainingships);
        System.out.println(" -  Enemy boats destroyed: %d", destroyedships);

    };}

