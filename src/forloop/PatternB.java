package forloop;

public class PatternB {
    public static void main(String[] args) {
        for (int number = 6;number >= 1;number--){
            for (int number2 = 1;number2 <= number;number2++){
                System.out.print(number2);
            }
        System.out.println();
    }
  }
}