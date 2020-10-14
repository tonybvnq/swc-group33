import javax.naming.Name;
import java.util.*;


public class OutputAssembler {
    NamedRow[] rowList;

    public OutputAssembler(NamedRow[] inputrows){
        rowList = inputrows;
    }

    // removed static keyword
    public  void printBoard() {
        System.out.println("   |[A][B][C][D][E][F][G][H][I][L]");
        System.out.println("---|------------------------------");
        for (NamedRow row : this.rowList){
            row.printRow();

        //for (int i = 0; i < 9; i++) {
            //TBD: Allocate i to the specific named row instance

            // the output assembler should either take the rows as input since they are initialized in Main, or
            // it only prints the constant first to lines

            // output assembler takes a list with NamedRow Obnject and does for every element element.printRow


        }
    }
}
