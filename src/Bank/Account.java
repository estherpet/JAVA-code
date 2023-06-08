package Bank;

public class Account {
    private int balance;
    private String firstName;
    private String lastName;
    private String pin;
    private String phoneNumber;
    private String accountNumber;

    public Account(String firstName, String lastName, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }

    public void deposit(int amount) {
        if (amount > 0) balance += amount;

    }

    public int getBalance(String pin) {
        this.pin = pin;
        return balance;
    }

    public void withdraw(String pin, int amount) {
        if (this.pin == pin) {
            if (amount <= balance) {
                balance -= amount;
            }
        }
    }

    public void setPin(String pin) {
        this.pin = pin;

    }

    public void getPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setPhoneNumber(){

    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
}




