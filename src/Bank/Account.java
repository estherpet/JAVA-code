package Bank;

public class Account {
    private int balance;
    private String firstName;
    private String lastName;
    private String pin;
    private String phoneNumber;
    private String accountNumber;

    public Account(String firstName, String lastName, String pin,String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int amount) {
        if (amount > 0) balance += amount;
        if (amount <= 0) throw new IllegalArgumentException("amount cannot be less than zero");

    }
    public int getBalance(String pin) {
       if (pin.equals(pin))
            return balance;
        System.out.println(balance);
        return 0;

    }

    public void withdraw(String pin, int amount) {
        if (this.pin.equals(pin)) {
            if (amount <= balance) {
                balance -= amount;
            }
            if (amount > balance)throw new IllegalArgumentException("cannot withdraw amount greater than balance");
        }
    }

    public void setPin(String pin) {
        this.pin = pin;
        if (this.pin != "4")throw new IllegalArgumentException("Enter four digit pin");

    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
        if (this.accountNumber != accountNumber)throw new IllegalArgumentException("enter correct account number");

    }
    @Override
    public String toString(){
        return String.format("""
                NAME: %s%n
                ACCOUNT NUMBER: %s%n
                BALANCE: %s%n
                """, (firstName + " " + lastName) ,accountNumber,balance );
    }

}




