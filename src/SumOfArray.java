import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays = new int[5];
        int num;
        double sum = 0;
        double average = 0;
        int length = arrays.length;

        for (num = 0; num < arrays.length; num++) {
            System.out.println("Enter a number :");
            arrays[num] = scanner.nextInt();
            sum += arrays[num];
            average = sum / length;
        }
        System.out.println("Average is " + average);
    }
}

//        for (num = 0; num < arrays.length; num++) {
////            sum += arrays[num];
//        }
//        System.out.println(Arrays.toString(arrays) + " sum is = " + sum);





