package chapter4;

public class BinaryDecimal {
    public static void main(String[] args) {
        int userInput = 110;
        int sum = 0;
        for (int index = 0;index < userInput;index++) {
            int remainder;
            if (index == 0) {
                remainder = userInput % 10;
                sum += remainder * Math.pow(2, index);
            }
            if (index > 0) {
                userInput = userInput / 10;
                remainder = userInput % 10;
                sum += remainder * Math.pow(2, index);
            }
        }
            System.out.println(sum);

    }
}
