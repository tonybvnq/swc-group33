import java.util.Arrays;
import java.util.List;


public  class NamedRow implements Row {
    public int rowNumber;

    public NamedRow(int rowNumber){
        setRowNumber(rowNumber);
    };


    // string representation of outputrow
    public String stringRepr = "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]";

    // convert string represatation to char Array for itaration
    public char[] listRepr = stringRepr.toCharArray();

    // method that makes the output with rownumber in front

    public  int getRowNumber(){
        return rowNumber;
    }

    public String getStringRepr(){
        return stringRepr;
    }

    public char[] getListRepr(){return  listRepr;}

    public  void setRowNumber(int number){
        this.rowNumber = number;
    }

    // replaces element in rowlist when ship is placed. Takes x coordinate as letter and shipletter as arguments
    public void setRowInstance(char coordinate, char shipletter){

        int place = 0;

        if (coordinate == 'A'){ place = 1;}
        if (coordinate == 'B'){ place = 2;}
        if (coordinate == 'C'){ place = 3;}
        if (coordinate == 'D'){ place = 4;}
        if (coordinate == 'E'){ place = 5;}
        if (coordinate == 'F'){ place = 6;}
        if (coordinate == 'G'){ place = 7;}
        if (coordinate == 'H'){ place = 8;}
        if (coordinate == 'I'){ place = 9;}
        if (coordinate == 'L'){ place = 10;}

        // Check for valid x coordinate, pro call testing function
        if (place == 0) {System.out.println("INVALID X COORDINATE!!");}

        // logic to reach right index
        int index = 1 + ((place -1) * 3);

        this.listRepr[index] = shipletter;
        this.stringRepr = String.valueOf(this.listRepr);
    };

    // creates the valid output row and prints it
    public void printRow(){
        String outputReprs = String.format("[%d]|%s", this.rowNumber, stringRepr);

        System.out.println(outputReprs);}
    }