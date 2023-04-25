package forloop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        for (int pal = 0;number > 0;number/= 10){
            int remainder = number % 10;
            pal  =(pal * 4)+ remainder;
        }

        }
    }
