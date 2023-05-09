import java.util.Scanner;

public class Kilogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number in pound");
        double number  = scanner.nextDouble();
       number = number * 0.454;
        System.out.println("kilogram is :" + number);

    }
}
