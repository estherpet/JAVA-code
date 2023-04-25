package chapter2;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter an integer");
        int  number = scannerObject.nextInt();
        if(number % 3  == 0){
            System.out.println("Divisible by 3");

        }
        else {
            System.out.println("Not divisible by 3");
        }

    }
}
