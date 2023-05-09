package chapter5;

public class IntegerDivisibleBy3 {
    public static void main(String[] args) {
        for (int num = 1; num <= 30;num++){
            if (num % 3 == 0){
                System.out.println(num    +    "  =  is divisible by 3");
            }
            else {
                System.out.println(num    +  " =  is not divible by 3");}
        }

    }
}