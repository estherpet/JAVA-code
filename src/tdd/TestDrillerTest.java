package tdd;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerTest {

    public void setUp(){
        TestDriller testDriller = new TestDriller();
    }
    @Test
    public void TwoThousandPerCopyTest(){
        double price1 = TestDriller.amount(1);
        double price2 = TestDriller.amount(2);
        double price3 = TestDriller.amount(3);
        double price4 = TestDriller.amount(4);

        assertEquals(2000,price1);
        assertEquals(2000,price2);
        assertEquals(2000,price3);
        assertEquals(2000,price4);
    }
    @Test
    public void OneThousandEightHundredPerCopyTest(){
        double price1 = TestDriller.amount(9);
        double price2 = TestDriller.amount(8);
        double price3 = TestDriller.amount(7);
        double price4 = TestDriller.amount(6);

        assertEquals(1800,price1);
        assertEquals(1800,price2);
        assertEquals(1800,price3);
        assertEquals(1800,price4);
    }
    @Test
    public void OneThousandSixHundredPerCopyTest(){
        double price1 = TestDriller.amount(29);
        double price2 = TestDriller.amount(28);
        double price3 = TestDriller.amount(27);
        double price4 = TestDriller.amount(26);

        assertEquals(1600,price1);
        assertEquals(1600,price2);
        assertEquals(1600,price3);
        assertEquals(1600,price4);
    }
    @Test
    public void OneThousandFiveHundredPerCopyTest(){
        double price1 = TestDriller.amount(49);
        double price2 = TestDriller.amount(48);
        double price3 = TestDriller.amount(47);
        double price4 = TestDriller.amount(46);

        assertEquals(1500,price1);
        assertEquals(1500,price2);
        assertEquals(1500,price3);
        assertEquals(1500,price4);

    }
    @Test
    public void OneThousandThreeHundredPerCopyTest(){
        double price1 = TestDriller.amount(99);
        double price2 = TestDriller.amount(98);
        double price3 = TestDriller.amount(97);
        double price4 = TestDriller.amount(96);

        assertEquals(1300,price1);
        assertEquals(1300,price2);
        assertEquals(1300,price3);
        assertEquals(1300,price4);
    }
    @Test
    public void OneThousandTwoHundredPerCopyTest(){
        double price1 = TestDriller.amount(199);
        double price2 = TestDriller.amount(198);
        double price3 = TestDriller.amount(197);
        double price4 = TestDriller.amount(196);

        assertEquals(1200,price1);
        assertEquals(1200,price2);
        assertEquals(1200,price3);
        assertEquals(1200,price4);

    }
    @Test
    public void OneThousandOneHundredPerCopyTest(){
        double price1 = TestDriller.amount(499);
        double price2 = TestDriller.amount(498);
        double price3 = TestDriller.amount(497);
        double price4 = TestDriller.amount(496);

        assertEquals(1100,price1);
        assertEquals(1100,price2);
        assertEquals(1100,price3);
        assertEquals(1100,price4);
    }

}
