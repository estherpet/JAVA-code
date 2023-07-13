package Diary;

import javax.swing.*;
import java.util.Scanner;

public class Main {
private  static final Scanner scanner = new Scanner(System.in);
private static final Diary diary = new Diary("username","password");

    public static void main(String[] args) {
display();
//displays();
    }
    private static void display(){
        String message = """
                1-> UNLOCK DIARY
              
                """;
        String option = input(message);
        if (option.charAt(0) == '1') {
            unlockDiary();
        }
        displays();

    }
    private static void displays(){
        String message = """
                1-> ADD GIST
                2-> FIND GIST
                3-> UPDATE GIST
                4->DELETE GIST
                """;String option = input(message);
                switch (option.charAt(0)){
                    case '1'-> addGist();
                    case '2'->findGist();
                    case '3'->updateGist();
                    case '4'->deleteGist();
                }
    }

    private static void deleteGist() {
        String title = input("Enter title to delete");
        diary.deleteGist(title);
displays();
    }

    private static void updateGist() {
        int id = Integer.parseInt(input("Enter id"));
        String title = input("Enter title");
        String body = input("update body");
    diary.updateGist(id,title,body);
    displays();
    }

    private static void findGist() {
        String title = input("Enter title to find gist");
diary.findGistByTitle(title);
displays();
    }

    private static void addGist() {
        String title = input("Enter title");
        String body = input("Enter body of gist");
diary.addGist(title,body);
displays();
    }

    private static void unlockDiary() {
        String password = input("Enter password");
        diary.unlockWith(password);
displays();
    }

    private static String input(String message) {
         return JOptionPane.showInputDialog(message);
    }
    private static void display(String message){
        JOptionPane.showMessageDialog(null,message);
    }
}
