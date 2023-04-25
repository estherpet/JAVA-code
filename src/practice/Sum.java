package practice;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scannerObject.nextInt();
        System.out.println(  number + 10);
    }
}
