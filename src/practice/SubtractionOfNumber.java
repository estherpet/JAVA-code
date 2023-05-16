package practice;

public class SubtractionOfNumber {
    public static void main(String[] args) {
        System.out.println(subtractionOfNumbers(22,12));

    }
    public static int subtractionOfNumbers(int number1, int number2) {
        int i = 0;
        int num = 0;
        if (number1 > number2) {
            return number1 - number2;
        } else {
            num = number2 - number1;
            return num;
        }

    }
}
