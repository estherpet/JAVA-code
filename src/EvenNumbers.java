import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        for (int count = 0;count < number;count++){
            if (count % 2 == 0)
                System.out.println("even number ");

            }
    }
}

