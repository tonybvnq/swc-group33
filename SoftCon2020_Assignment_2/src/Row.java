
import java.util.*;

public interface Row {

    public int getRowNumber();

    public String getStringRepr();

    public char[] getListRepr();

    public  void setRowNumber(int number);

    // replaces element in rowlist at input place with intput letter
    public  void setRowInstance(int place, char letter);
}
