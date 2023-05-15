import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int value = 1;
        for (int count = 0; count < 5;count++) {
            value = value * number;
        }
            System.out.println(value);
    }
}
