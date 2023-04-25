package forloop;

public class PatternA {
    public static void main(String[] args) {
        for (int number = 1;number <= 6;number++){
            for (int number2 = 1;number2 <= number;number2++){
                System.out.print(number2);
            }
            System.out.println();
        }
    }
}
