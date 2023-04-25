import java.util.Scanner;

public class DivideNumber {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scannerObject.nextInt();
        System.out.println(number / 2);
    }
}
