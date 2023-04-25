package calculator;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 public class CalculatorTest {
     public void setUp(){
         Calculator calculator = new Calculator();
     }

     @Test
     public void AddNumberTest(){
         Calculator calculator = new Calculator();
         int result = calculator.add(6,5);
         assertEquals(11,result);
     }
     @Test
     public void SubtractNumberTest(){
         Calculator calculator = new Calculator();
         int result = calculator.subtract(7,10);
         assertEquals(17,result);

     }
     @Test
     public void DivideNumberTest(){
         Calculator calculator = new Calculator();
         int result = calculator.divide(10,2);
         assertEquals(5,result);
     }
     @Test
     public void MultiplyNumberTest(){
         Calculator calculator = new Calculator();
         int result = calculator.multiply(3,2);
         assertEquals(6,result);
     }

}