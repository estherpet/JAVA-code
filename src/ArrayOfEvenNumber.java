import java.util.Scanner;

public class ArrayOfEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] evenNumber = new int[5];
        for (int index = 0; index < evenNumber.length;index++){
            System.out.println("Enter a Even number");
            evenNumber[index] = scanner.nextInt();
            if (evenNumber[index] % 2 == 0){
                index++;
            }
            else {
                System.out.println("you entered a wrong number");
            }
        }
    }
}
