package chapter2;

import java.util.Scanner;

public class Integers {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scannerObject.nextInt();
        int num = number * number;
        if (number > num){
            System.out.printf("%d > %d%n", number,num);
        }
        if (number == num){
            System.out.printf("%d == %d%n", number,num);
        }
        if (number != num){
            System.out.printf("%d != %d%n", number,num);
        }
        if (number < num ){
            System.out.printf("%d < %d%n",number,num);
        }

    }
}
