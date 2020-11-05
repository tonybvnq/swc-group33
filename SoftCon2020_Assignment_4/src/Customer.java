public class Customer {
    // name
    private String name;
    // surname
    private String surname;
    // age
    private int age;
    // bank account number
    private int accountNumber;
    // savings
    private SavingsAccount savingsAccount;
    // unique Identification Number (ID)
    private int UID;

    private enum customerLevel{
        Regular,
        Gold,
        Platinum
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


}
