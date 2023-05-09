import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number ");
        int num2 = input.nextInt();
        System.out.println("Enter third number");
        int num3 = input.nextInt();
        System.out.println("Enter fourth number ");
        int num4 = input.nextInt();
        System.out.println("Enter last number");
        int lastNumber = input.nextInt();
        if (firstNumber == lastNumber){
            if (num2 == num4){
                System.out.println("It is a palindrome");

            }
        }
        else System.out.println("Not a palindrome");
    }
}
