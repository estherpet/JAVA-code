package chapter2;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 3;
        int number3 = 5;
        int number4 = 7;
        int number5 = 10;
        int smallestNumber = number1;
        int largestNumber = number5 ;
        if (number1 < number5 ) {
            smallestNumber = number1;
        }
        if (number1 < number4){
            smallestNumber = number1;
        }
        System.out.println("smallest number is : " + smallestNumber);
        if (number5 > number1){
            largestNumber = number5;
        }
        if (number5 > number2){
            largestNumber = number5;

        }
        if (number5 > number3){
            largestNumber = number5;
        }
        System.out.println("The largest number is : " + largestNumber);


    }
}
