package phoneBook;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private  static  final PhoneBook phonebook = new PhoneBook();
    public static void main(String[] args) {
        display();
    }
    private static void createContact(){
        String firstName =input ("Enter first name");
        String lastName = input("Enter last name");
        String number = input("Enter your phone number");
        System.out.println(phonebook.createContact(firstName,lastName,number));
        display();
    }
    private static void display(){
        String message = """
                1-> CREATE CONTACT
                2-> SEARCH CONTACT
                3-> DELETE CONTACT
                4-> UPDATE CONTACT
                """;
        String option = input(message);
        switch (option.charAt(0)){
            case '1' -> createContact();
            case '2' -> searchContact();
            case '3'-> deleteContact();
            case '4' -> updateContact();
        }
    }

    private static void updateContact() {
        String oldName = input("Enter name of contact");
        String newName = input("Enter new name");
        phonebook.updateContact(oldName,newName);
        displayMessage("contact updated");
        display();

    }

    private static void deleteContact() {
        String name = input("Enter name of contact");
        phonebook.DeleteContact(name);
        displayMessage("contact deleted");
        display();
    }
    private static void searchContact() {
        String name = input("Enter name of contact");
        phonebook.findContact(name);
        display();
    }
    private  static String input(String message){
//        displayMessage(message);
       return JOptionPane.showInputDialog(message);

    }
    private  static void displayMessage(String message){
        JOptionPane.showMessageDialog(null,message);
//        System.out.println(message);
    }
}
