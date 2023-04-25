package forloop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int number = input.nextInt();
        int primeCounter = 0;
        int count = 1;
        while (count <= number){
           if (number % count == 0){
               primeCounter++;
           }
           count++;
        }
        if (primeCounter == 2){
            System.out.println(number + " is  a prime number");
        }
        else System.out.println(number + " is not a prime number");
    }
}
