package practice;

import java.util.Scanner;

public class CelsiusToFahranheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in celsius");
        double celsius = input.nextDouble();
        double fahranheit = ((double) 9 /5) * celsius + 32;
        System.out.println("fahranheit is:  " + fahranheit);
    }
}
