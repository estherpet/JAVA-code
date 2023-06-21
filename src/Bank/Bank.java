package Bank;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();

    public Account registerNewCustomer(String firstName, String secondName, String pin, String phoneNumber) {
        Account account = new Account(firstName, secondName, pin, phoneNumber);
        accounts.add(account);
        final String actNumber = accountNumber(phoneNumber);
        account.setAccountNumber(actNumber);
        return account;
    }


    public String accountNumber(String phoneNumber) {
        return phoneNumber.substring(1);
    }

    public int accountSize() {
        return accounts.size();
    }

    public void deposit(String acNumber, int amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(acNumber)) {
                account.deposit(amount);
            }
        }
    }

    public int getBalance(String accountNumber, String pin) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account.getBalance(pin);
            }

        }

      throw new IllegalArgumentException("account number not found");
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
//        for (Account account : accounts) {
//            if (account.getAccountNumber().equals(senderAcNumber)) {
//                account.withdraw(pin, amount);
//                transferToReceiver(receiverAcNumber,amount,pin);
//            }
//        }
        withdraw(senderAcNumber,amount,pin);
        deposit(receiverAcNumber,amount);

    }
    public void transferToReceiver(String receiverAcNumber,int amount,String pin){
        for (Account account : accounts){
            if (account.getAccountNumber().equals(receiverAcNumber)){
                account.deposit(amount);
            }
        }
    }
}