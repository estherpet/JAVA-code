import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        int sum = 0;
        while (number > 0) {
         sum+= number % 10;
         number = number /10;
        }
        System.out.println(sum);
    }
}

//            if (count  %2 != 0){
//                System.out.println("it is an even number");
//            }
//            else System.out.println("it is an odd number");



