public class Customer {
    // name
    public static int serialnr = 0;

    private String name;

    // surname
    private String surname;

    // age
    private int age;

    // bank account number
    private int accountNumber;

    // savings
    private SavingsAccount savingsAccount;

    private CreditCard creditCard;

    // unique Identification Number (ID)
    private int UID;

    public enum customerLevel{
        Regular,
        Gold,
        Platinum
    }

    private customerLevel currentLevel;


    // SETTERS AND GETTERS
    public void setName(String name) { this.name = name; }
    public  void setSurname(String surname) {this.surname = surname; }
    public void setAge(int age) {this.age = age; }
    public void setAccountNumber(int accountNumber) { this.accountNumber = accountNumber; }
    public void setSavingsAccount(SavingsAccount savingsAccount) { this.savingsAccount = savingsAccount; }
    public void setcustomerLevel(customerLevel customerlevel){this.currentLevel = customerlevel; }
    public void setUID(int UID) {this.UID = UID; }


    public CreditCard getCreditCard(){ return this.creditCard;}
    public String getFullName(){ return this.surname + " " + this.name; }
    public int getAge(){return this.age;}
    public int getAccountNumber(){return this.accountNumber;}
    public SavingsAccount getSavingsAccount(){return this.savingsAccount;}
    public int getUID(){return this.UID;}
    public customerLevel getCurrentLevel(){
        return this.currentLevel;
    }
    public void setCreditCard(){
            if(this.getCurrentLevel() == customerLevel.Regular ){
                this.creditCard = new RegularCard(this.getFullName(), this.getSerialnr(), "01/01/2022");
            }
            else if (this.getCurrentLevel() == customerLevel.Gold ){
                this.creditCard = new GoldCard(this.getFullName(), this.getSerialnr(),  "01/01/2022");
            }
            else {this.creditCard = new PlatinumCard(this.getFullName(), this.getSerialnr(), "01/01/2022");}
    }
    public int getSerialnr(){
        Customer.serialnr += 1;
        return serialnr;
    }


    // INITIALIZATION
    public Customer(String name, String surname, int age, int accountNumber, int UID){
        this.setName(name);
        this.setSurname(surname);
        this.setAge(age);
        this.setAccountNumber(accountNumber);

        // CREATE SAVINGS ACCOUNT OR SO??

        this.setUID(UID);
        this.setcustomerLevel(customerLevel.Regular);
        this.setCreditCard();
    }


    // Level

    // Regular customer: they have a Regular Credit Card and can pay only up to
    // 2000 CHF by credit card per transaction. Payments with bank transfer do not
    // have an amount limit.

    // Golden customer: they have a Gold Credit Card and can pay up to 5000
    // CHF by credit card per transaction. Payments with bank transfer do not have
    // an amount limit.

    // Platinum customer: they have a Platinum Credit Card and can pay up to
    // 10000 CHF by credit card per transaction. Payments with bank transfer do
    // not have an amount limit.

    public void deposit(float money){
        this.getSavingsAccount().deposit(money);
    }

    public float withdraw(float money) throws Exception {
        this.getSavingsAccount().withdraw(money);
        return money;
    }

    void payFromAccount(float money) throws Exception {
       {this.getSavingsAccount().withdraw(money);};
    }

    void payWithCard(float money) throws Exception {
        {this.getSavingsAccount().creditCardPayment(money, this);};
    }

}
