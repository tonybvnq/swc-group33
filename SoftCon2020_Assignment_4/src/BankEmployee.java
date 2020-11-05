import java.util.ArrayList;

abstract class BankEmployee {

    // bank employees supervise all the operations in the bank. Each employee
    //name
    private static String name;

    // surname
    private static String surname;

    // identification number
    private static String ID;

    // list of customers assigned to them
    private static ArrayList customerList;


    //can upgrade a customer from Regular level to Golden level given the Customer ID.

}
    //Employees are divided in three levels:

    // Regular employee: they do not have any special characteristic.

class RegularEmployee extends BankEmployee{

}

    // Section chief: each Section chief is assigned to a different city. In addition to being
    // able to perform any regular employee's actions, a section chief can downgrade the
    // level of a customer from Gold to Regular given the customer ID. Furthermore,
    // differently from a regular employee, a section chief can upgrade a customer level
    // from Golden to Platinum.

class SectionChief extends BankEmployee{

    }

    // Main Chief: The main chief can perform all actions of a section chief but they are not
    // assigned to any city. Moreover, they can downgrade a customer from Platinum level
    // to any previous level (Golden or Regular).

class MainChief extends BankEmployee{

}




