import java.util.Scanner;

public class SumOfFiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int count = 0; count < 5; count++) {
            System.out.println("Enter a number:");
            int  number = scanner.nextInt();

            sum = number + sum;

        }
        System.out.println("sum is :" + sum );

    }
}
