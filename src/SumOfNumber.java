import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int digit = input.nextInt();
        System.out.println("result =" + sumNumber(digit));

    }


    public static int sumNumber(int number){
        int result = 0;
        while (number > 0){
            result += number % 10;
            number /= 10;


        }

            return result;
        }
}

