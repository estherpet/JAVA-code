package checkOutApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckOutTest {
    CheckOut checkOut = new CheckOut();
    @Test
    public  void calculateTotalOfItemTest(){
        assertEquals(400,checkOut.buy(2,200));
    }
    @Test
    public void  calculateSubtotalOfItemTest(){
        checkOut.buy(2,500);
        checkOut.buy(2,10);
        assertEquals(1020,checkOut.subTotal());
    }
    @Test
    public  void discountTest(){
        checkOut.buy(2,10);
        checkOut.buy(2,500);
        assertEquals(81.0,checkOut.discount(8));
    }
    @Test
    public void vatTest(){
        checkOut.buy(2,10);
        checkOut.buy(2,500);
        assertEquals(178.0,checkOut.VAT());
    }
    @Test
    public void billTotalTest(){
        checkOut.buy(2,10);
        checkOut.buy(2,500);
        assertEquals(1117,checkOut.billTotal());
    }
    @Test
    public void buyItem_getBalance(){
        checkOut.buy(2,10);
        checkOut.buy(2,500);
        assertEquals(-17,checkOut.balance(1100));
    }
}