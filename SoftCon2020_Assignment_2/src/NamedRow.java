import java.util.Arrays;
import java.util.List;


public  class NamedRow implements Row {
    public int rowNumber=0;

    public String stringRepr = " [] [] [] [] [] [] [] [] [] [] ";

    // public List<String> rowList = Arrays.asList("[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]");

    public char[] listRepr = stringRepr.toCharArray();

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

    // replaces element in rowlist at input place with intput letter
    public void setRowInstance(int place, char letter){
        this.listRepr[place] = letter;
    };

    public void printRow(){System.out.println(stringRepr);}

}