package practice;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {
    Math math = new Math();
     @Test
       public void addNumberTest(){
         Math.summationOfNumbers(23,23);
         assertEquals(46,Math.summationOfNumbers(23,23));
     }
     @Test
    public void negativeNumberTest(){
         Math.summationOfNumbers(-8,-2);
         assertEquals(-10,Math.summationOfNumbers(-8,-2));
         assertEquals(10,Math.summationOfNumbers(5,5));
     }
     @Test
    public void addDecimalNumberTest(){
         Math.summationOfNumbers((int) 0.77, (int) 89.8);
         assertEquals(89,Math.summationOfNumbers((int) 0.77, (int) 89.8));
     }


}