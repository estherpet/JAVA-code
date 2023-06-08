package Bank;

import java.util.ArrayList;

public class Bank {

    private String pin;
    private int balance;

    private ArrayList<Account> accounts = new ArrayList<>();

    public void registerNewCustomer(String firstName, String secondName, String pin, String phoneNumber) {
        Account account = new Account(firstName, secondName, pin);
        accounts.add(account);
        account.setAccountNumber("08130468722");

    }

    public String accountNumber(String phoneNumber) {
        if (phoneNumber.charAt(0) == '0') {
            return phoneNumber.substring(1);
        } else {
            return phoneNumber;
        }
    }

    public int accountSize() {
        return accounts.size();
    }

    public void deposit(String acNumber, int amount) {
        for (Account account : accounts){
            if (account.getAccountNumber() == acNumber) {
                account.deposit(amount);
            }
    }
}
    public int getBalance(String accountNumber,String pin) {
        this.pin = pin;
        return balance;
    }
}
