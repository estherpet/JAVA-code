package practice;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractionOfNumberTest {
    SubtractionOfNumber subtraction = new SubtractionOfNumber();

    @Test
    public void subtractNumberTest(){
        SubtractionOfNumber.subtractionOfNumbers(23,56);
        assertEquals(33,SubtractionOfNumber.subtractionOfNumbers(23,56));
        assertEquals(0,SubtractionOfNumber.subtractionOfNumbers(25,25));
        assertEquals(2,SubtractionOfNumber.subtractionOfNumbers(22,20));
    }


}