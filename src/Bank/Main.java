package Bank;

import java.util.Scanner;


public class Main {
private  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();
    }
    private static void displayMainMenu(){
        String message = """
    WELCOME TO QUEENIE BANK
    
    INSERT  CARD AND PRESS ENTER
     """;
        input(message);
        input("Enter your pin");
        proceedMenu();


    }
    public static void proceedMenu(){

        String message = """
                WELCOME
                
                PRESS CASH TRANSACTION BUTTON TO PROCEED TO TRANSACTION MENU
                -> 1 CASH TRANSACTION
                -> 2 SELECT INSTANT PIN
                PRESS CANCEL TO TERMINATE TRANSACTION
                """;
        input(message);
        displayService();
    }


    private static void displayService(){
        String services = """
                PLEASE SELECT SERVICES
                
                1->  WITHDRAW CASH
                2-> BALANCE INQUIRY
                3-> TRANSFER FUND
                4-> CHANGE PIN
                5-> OTHER SERVICES
                PRESS CANCEL TO TERMINATE TRANSACTION
                """;
        switch (input(services).charAt(0)){
            case '1' -> withdrawCash();
            case '2' -> balanceInquiry();
            case '3' -> transferFund();
            case '4' -> changePin();
            case '5' -> otherServices();
        }

    }

    private static void otherServices() {
    }

    private static void changePin() {
        String changepin = "PIN CHANGED";
        input(changepin);
    }

    private static void transferFund() {
            String transferMessage = """
                    PRESS CANCEL TO TERMINATE TRANSACTION
                    
                    1-> DIAMOND BANK
                    2-> SAPPHIRE BANK
                    3-> GOLD BANK
                    4-> SHALOM BANK
                    5-> OTHERS
                    """;
            input(transferMessage);
            accountType();
            input("PLEASE ENTER DESTINATION ACCOUNT NUMBER");
            amount();
            doneMessage();
    }

    private static void balanceInquiry() {

    }

    private static void withdrawCash() {
        accountType();
        receipt();
        amount();
        doneMessage();
//        display("Unable to dispense cash");

    }

    private static void doneMessage() {
        String doneMessage = """
                DO YOU WANT TO PERFORM ANOTHER TRANSACTION?
                1-> YES
                2-> NO
                """;
        if (input(doneMessage).charAt(0) == '1') {
            proceedMenu();
        } else {
            display("PLEASE TAKE YOUR CARD");
        }
    }

    private static void amount() {
        String amount = """
                       SELECT THE AMOUNT
                PRESS CANCEL TO TERMINATE TRANSACTION
                1-> N500
                2-> N1000
                3-> N5000
                4-> N10000
                5-> N20000
                6-> OTHERS                  
                """;
        input(amount);

    }

    private static void receipt() {
        String receiptMessage = """
                DO YOU WANT RECEIPT FOR THIS TRANSACTION
                1-> YES
                2-> NO
                """;
        input(receiptMessage);
    }

    private static void accountType() {
        String  AccountType = """
                SELECT THE INQUIRY ACCOUNT
              
                1-> CURRENT
                2-> SAVING
                3-> CREDIT
                
                """;
        input(AccountType);

    }

    private static void display(String message){
        System.out.println(message);
    }

    private static String input(String message) {
    display(message);
    return scanner.nextLine();
    }
}
