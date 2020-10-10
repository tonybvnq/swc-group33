

import java.util.*;

public interface Row {

    // initializer

    public int getRowNumber();

    public String getStringRepr();

    public char[] getListRepr();

    public  void setRowNumber(int number);

    // replaces element in rowlist at input place with intput letter
    public  void setRowInstance(char coordinate, char shipletter);

    public void printRow();
}


