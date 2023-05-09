import java.util.Scanner;

public class Meter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for feet");
        double number = scanner.nextDouble();
        double number2 = number /0.305;
        System.out.println(number2);

    }
}
