package chapter2;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter your weight :");

        double weight = scannerObject.nextDouble();

        System.out.println("Enter your height :");

        double height = scannerObject.nextDouble();

        double BMI = weight * 703 / height * height;

        System.out.println("BMI is : " + BMI);
    }
}
