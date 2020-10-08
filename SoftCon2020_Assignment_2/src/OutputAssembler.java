public class OutputAssembler {
    public static void printBoard() {
        System.out.println("   |[A][B][C][D][E][F][G][H][I][L]");
        System.out.println("---|------------------------------");

        for (int i = 0; i < 9; i++) {
            //TBD: Allocate i to the specific named row instance
            NamedRow.printRow();
        }
    }
}
