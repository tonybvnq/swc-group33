
import java.util.*;

public interface Row {

    public int getRowNumber();

    public  List<String> getrowList();

    public  void setRowNumber(int number);

    // replaces element in rowlist at input place with intput letter
    public  void setRowInstance(int place, String letter);
}

