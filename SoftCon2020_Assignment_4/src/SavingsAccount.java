public class SavingsAccount {

    private float balance = 0;
    public float getBalance() {
        return balance;
    }

    // Depositing money simply adds the sum of money deposited to the customer's
    // savings.
    public void deposit(float amount){
        balance += amount;
    }
    // Withdrawing money removes the specified sum to the customer's savings. A
    // customer can not withdraw more than the amount of their savings. Withdrawing
    // money returns the amount of money withdrawn.
    public float withdraw(float amount) throws Exception {
        if (balance >= amount){
            balance -= amount;
            return amount;
        }else{
            System.out.println("NOT ENOUGH MONEY ON ACCOUNT");
            throw new Exception();
        }
    }
    // Paying with bank transfer is only allowed if the customer has enough savings to pay
    // the specified amount of money. However, the method subtracts the paid amount from
    // the customer's savings, but it does not return the amount of money paid.
    public void bankTransfer(float amount) throws Exception {
        if (balance >= amount){
            balance -= amount;
        }else{
            throw new Exception();
        }
    }
    // Paying by credit cards is always allowed, regardless of the amount of money
    // available in the customer's savings. However, a customer can not pay more than the
    // amount allowed by its credit card for each transaction (e.g., 2000 CHF for a regular
    // credit card, as specified below).
    public void creditCardPayment(float amount, Customer customer) throws Exception {
        if (customer.getCreditCard().getCardLimit() > amount){
            balance -= amount;
        }else{
            System.out.println("CARDLIMIT IS TO LOW TO PAY THIS PRICE");
            throw new Exception();
        }
    }
}


