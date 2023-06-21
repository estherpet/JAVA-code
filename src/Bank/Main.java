package Bank;



import javax.swing.*;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static final Bank bank = new Bank();

    public static void main(String[] args) {
        displayService();

    }

    private static void registerNewCustomer() {
        String firstName = input("Enter your first name");

        String secondName = input("Enter your second name");
        String pin = input("Enter your pin");
        String phoneNumber = input("Enter your phone number");
        bank.registerNewCustomer(firstName, secondName, pin, phoneNumber);
        System.out.println(bank.registerNewCustomer(firstName, secondName, pin, phoneNumber));
        displayService();

    }

    private static void displayService() {
        String services = """
                PLEASE SELECT SERVICES
                1-> CREATE ACCOUNT
                2->  WITHDRAW CASH
                3-> BALANCE INQUIRY
                4-> TRANSFER FUND
                5-> CHANGE PIN
                6-> DEPOSIT
                PRESS CANCEL TO TERMINATE TRANSACTION
                """;
        switch (input(services).charAt(0)) {
            case '1' -> registerNewCustomer();
            case '2' -> withdrawCash();
            case '3' -> balanceInquiry();
            case '4' -> transferFund();
            case '5' -> changePin();
            case '6' -> deposit();
        }

    }

    private static void deposit() {
//           try {
        String amount = input("enter your amount");
        int amount1 = Integer.parseInt(amount);
        String accountNumber = input("enter your account number");
        bank.deposit(accountNumber, amount1);
        display("deposit of " + amount1 + " was successful");
//    }

    //           catch (Exception exception){
//               display(exception.getMessage());
//               deposit();
//           }
    displayService();


    }
    private static void changePin() {
        String changePin = input("enter new pin");

        input(changePin);
    }

    private static void transferFund() {
//        try {
            String senderAcNumber = input("Enter sender account number");

        String receiverAcNumber = input("Enter receiver account number");
        int amount = Integer.parseInt(input("Enter amount"));
        String pin = input("Enter your pin");

        bank.transfer(senderAcNumber,receiverAcNumber,amount,pin);
        display("Transfer of" + amount + "was successful");
//        }
//        catch (Exception exception){
//            display(exception.getMessage());
//            transferFund();
//        }
        displayService();
    }

    private static void balanceInquiry() {
//       try {
           String acNumber = input("Enter account number");

        String pin = input("Enter your pin");
        System.out.println(bank.getBalance(acNumber,pin));
//       }
//       catch (Exception exception){
//           display(exception.getMessage());
//           balanceInquiry();
//       }
        displayService();
    }

    private static void withdrawCash() {
//       try {
           String acNumber = input("Enter account number");

        int amount = Integer.parseInt(input("Enter amount"));
        String pin = input("Enter your pin");
        bank.withdraw(acNumber,amount,pin);
        display("Withdraw of" + amount + "was successful ");

//       }
//       catch (Exception exception){
//           display(exception.getMessage());
//           withdrawCash();
//       }
        displayService();

    }

    private static void display(String message){
        JOptionPane.showMessageDialog(null,message);
    }

    private static String input(String message) {
    return JOptionPane.showInputDialog(message);
    }
}
