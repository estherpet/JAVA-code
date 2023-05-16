package practice;

import java.util.Scanner;

public class VolumeOfACylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius and length of a cylinder");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * 22/7;
        double volume = area * length;
        System.out.println("The area is:  " + area + "  The volume is:  " + volume);
    }
}
