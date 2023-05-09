package chapter2;

import java.util.Scanner;

public class Extreme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many value the application need : ");
        int number = input.nextInt();
        int max= number;
        int min = number;
        for (int count = 0; count < number;count++){
            System.out.println("Enter an integer");
            int integer = input.nextInt();
            if (integer > max){
                max = integer;
            }
            if (integer < min){
                min = integer;
            }
        }
        System.out.println("Maximum number is : " + max);
        System.out.println("Minimum number is : " + min);
        System.out.println("Sum of two extreme is : " +(max + min));
    }

}

