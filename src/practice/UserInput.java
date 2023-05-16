package practice;


import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        userInput();

//        Scanner input = new Scanner(System.in);
//        int number = 0;
//        for (int index = 0; index < 5; index++) {
//            System.out.println("Enter a number");
//            number = input.nextInt();
//        }
//        System.out.println(number);
    }

    public static void userInput() {
        Scanner input = new Scanner(System.in);
        int number = 0;
        for (int index = 0; index < 5; index++) {
            System.out.println("Enter a number");
            number = input.nextInt();
            System.out.println("The number entered is : " + number);
        }




    }
}

