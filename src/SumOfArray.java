import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays = new int[5];
        int num;
        for (num = 0; num < arrays.length; num++) {
            System.out.println("Enter a number :");

            arrays[num] = scanner.nextInt();
        }
        int sum = 0;
        for (num = 0; num < arrays.length; num++) {
            sum += arrays[num];
        }
        System.out.println(Arrays.toString(arrays) + " sum is = " + sum);
         }

    }

