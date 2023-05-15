package chapter2;

import java.util.Scanner;

public class WorldPopulationGrowthCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the world population growth rate");
        long populationGrowth = input.nextLong();
        System.out.println("Enter annual population growth rate");
        double annualPopulation = input.nextDouble();
        for (int numberOfYears = 0; numberOfYears < 5;numberOfYears++) {
            populationGrowth *= annualPopulation;
            System.out.println(populationGrowth);
        }
    }
}
