import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter first Number");
        int number1 = object.nextInt();
        System.out.println("Enter second number");
        int number2 = object.nextInt();
        System.out.println("sum is : " + (number1 + number2));
    }
}
