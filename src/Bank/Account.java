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
//        if (amount < 0)

    }
    public int getBalance(String pin) {
        if (this.pin.equals(pin)) return balance;
        return 0;
    }

    public void withdraw(String pin, int amount) {
        if (this.pin.equals(pin)) {
            if (amount <= balance) {
                balance -= amount;
            }
        }
    }

    public void setPin(String pin) {
        this.pin = pin;

    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String accountNumber(String phoneNumber) {
        if (phoneNumber.charAt(0) == '0') {
            return phoneNumber.substring(1);
        } else {
            return phoneNumber;
        }
    }

}




