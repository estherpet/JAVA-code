package Bank;

import java.util.ArrayList;
import java.util.Objects;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();

    public void registerNewCustomer(String firstName, String secondName, String pin, String phoneNumber) {
        Account account = new Account(firstName, secondName, pin, phoneNumber);
        accounts.add(account);
        final String actNumber = accountNumber(phoneNumber);
        account.setAccountNumber(actNumber);

    }

    public String accountNumber(String accountNumber) {
        if (accountNumber.charAt(0) == '0') {
            return accountNumber.substring(1);
        } else {
            return accountNumber;
        }
    }

    public int accountSize() {
        return accounts.size();
    }

    public void deposit(String acNumber, int amount) {
        for (Account account : accounts) {
            if (Objects.equals(account.getAccountNumber(), acNumber)) {
                account.deposit(amount);
            }
        }
    }

    public int getBalance(String accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        return account.getBalance(pin);
    }

    public Account findAccount(String account) {
        for (Account account1 : accounts) if (account1.getAccountNumber().equals(account)) return account1;
        return null;
    }

    public void withdraw(String accountNumber, int amount, String pin) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.withdraw(pin, amount);
            }
        }
    }

    public void transfer(String senderAcNumber,String receiverAcNumber, int amount, String pin) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(senderAcNumber)) {
                account.withdraw(pin, amount);
                transferToReceiver(receiverAcNumber,amount,pin);
            }

        }

    }
    public void transferToReceiver(String receiverAcNumber,int amount,String pin){
        for (Account account : accounts){
            if (account.getAccountNumber().equals(receiverAcNumber)){
                account.deposit(amount);
            }
        }
    }
}