import java.util.Arrays;
import java.util.List;


public  class NamedRow implements Row {
    public int rowNumber=0;

    public List<String> rowList = Arrays.asList("[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]");

    public  int getRowNumber(){
        return rowNumber;
    }

    public  List<String> getrowList(){
        return rowList;
    };

    public  void setRowNumber(int number){
        this.rowNumber = number;
    };

    // replaces element in rowlist at input place with intput letter
    public void setRowInstance(int place, String letter){
        this.rowList.set(place, letter);
    };

    public void printRow(){System.out.println(Arrays.toString((rowList.toArray())));}

}