import java.util.ArrayList;

abstract class BankEmployee {

    // bank employees supervise all the operations in the bank. Each employee
    //name
    private String name;

    // surname
    private String surname;

    // identification number
    private String ID;

    // list of customers assigned to them
    private  ArrayList customerList = new ArrayList();



    // SETTERS AND GETTERS
    public void setName(String name) { this.name = name; }
    public  void setSurname(String surname) { this.surname = surname; }
    public void setID(String ID) { this.ID = ID; }

    public String getFullName(){ return this.surname + " " + this.name; }
    public String getID(){return this.ID;}
    public ArrayList getCustomerList(){
        return this.customerList;
    }


    // CUSTOMERLIST OPERATIONS
    public void addCustomer(Customer customer){
        this.customerList.add(customer);
    }

    public void removeCustomer(Customer customer){
        this.customerList.remove(customer);
    }

    public boolean customerIsinList(Customer customer){
        return this.getCustomerList().contains(customer);
    }


    //can upgrade a customer from Regular level to Golden level given the Customer ID.
    public void upgradeRegularToGold(Customer customer){
        if (customer.getCurrentLevel() != Customer.customerLevel.Regular){
            System.out.println("Customer is not RegularLevel");
        }
        else{
        customer.setcustomerLevel(Customer.customerLevel.Gold);
        customer.setCreditCard();}

    }

}
    //Employees are divided in three levels:

    // Regular employee: they do not have any special characteristic.

class RegularEmployee extends BankEmployee{

    public RegularEmployee(String surname, String name, String ID){
        this.setSurname(surname);
        this.setName(name);
        this.setID(ID);
    }

}

    // Section chief: each Section chief is assigned to a different city. In addition to being
    // able to perform any regular employee's actions, a section chief can downgrade the
    // level of a customer from Gold to Regular given the customer ID. Furthermore,
    // differently from a regular employee, a section chief can upgrade a customer level
    // from Golden to Platinum.

class SectionChief extends BankEmployee{

    private String city;

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity(){
        return this.city;
    }

    public SectionChief(String surname, String name, String ID, String city){
        this.setSurname(surname);
        this.setName(name);
        this.setID(ID);
        this.setCity(city);
    }

    // CAM  UPGRADE GOLT TO PLATIN AND DOWNGRADE GOLD TO REGULAR
    public void upgradeGoldToPlatinum(Customer customer){
        if (customer.getCurrentLevel() != Customer.customerLevel.Gold){
            System.out.println("Customer is not Goldlevel");
        }
        else{
        customer.setcustomerLevel(Customer.customerLevel.Platinum);
        customer.setCreditCard();}
    }

    public void downgradeGoldToRegular(Customer customer){
        if (customer.getCurrentLevel() != Customer.customerLevel.Gold){
            System.out.println("Customer is not Goldlevel");
        }
        else{customer.setcustomerLevel(Customer.customerLevel.Regular);
        customer.setCreditCard();}
    }
}

    // Main Chief: The main chief can perform all actions of a section chief but they are not
    // assigned to any city. Moreover, they can downgrade a customer from Platinum level
    // to any previous level (Golden or Regular).

class MainChief extends BankEmployee{

    public MainChief(String surname, String name, String ID){
        this.setSurname(surname);
        this.setName(name);
        this.setID(ID);}


    // CAM  UPGRADE GOLT TO PLATIN AND DOWNGRADE GOLD TO REGULAR
    // CAN DOWNGRADE PLATIN TO ANYTHING
    public void upgradeGoldToPlatinum(Customer customer){
        if (customer.getCurrentLevel() != Customer.customerLevel.Gold){
            System.out.println("Customer is not Goldlevel");
        }
        else{
        customer.setcustomerLevel(Customer.customerLevel.Platinum);
        customer.setCreditCard();}
    }

    public void downgradeGoldToRegular(Customer customer){
        if (customer.getCurrentLevel() != Customer.customerLevel.Gold){
            System.out.println("Customer is not Goldlevel");
        }
        else{
        customer.setcustomerLevel(Customer.customerLevel.Regular);
        customer.setCreditCard();}
    }

    public void downgradePlatinumToGold(Customer customer){
        if (customer.getCurrentLevel() != Customer.customerLevel.Platinum){
            System.out.println("Customer is not PlatinumLevel");
        }
        else{
        customer.setcustomerLevel(Customer.customerLevel.Gold);
        customer.setCreditCard();}
    }

    public void downgradePlatinumToRegular(Customer customer){
        if (customer.getCurrentLevel() != Customer.customerLevel.Platinum){
            System.out.println("Customer is not PlatinumLevel");
        }
        else{
        customer.setcustomerLevel(Customer.customerLevel.Regular);
        customer.setCreditCard();}
    }

}







