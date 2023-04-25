package chapter2;

public class TableOfSquareAndCube {
    public static void main(String[] args) {
        System.out.printf("Number  " + "Square  " + "Cube ");
        int square = 0;
        int cube = 0;
        for (int number = 0; number <= 10; number++){
            square = number * number;
            cube = number * number * number;
            System.out.println(number  +  "         " + square  + "        " +  cube);


        }
    }
}
