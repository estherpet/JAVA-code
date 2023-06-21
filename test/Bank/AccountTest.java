package Bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account account = new Account("Esther","Peter", "1234","08130468722");
    @Test
    public void accountExistTest(){
        assertNotNull(account);
    }
    @Test
    public void deposit_MoneyTest(){
        account.deposit(1000);
        assertEquals(1000, account.getBalance("1234"));
    }
    @Test
    public void deposit_Negative_MoneyTest(){
        assertThrows(IllegalArgumentException.class , ()-> account.deposit(-4678));
    }
    @Test
    public void Withdraw_MoneyTest(){
        account.deposit(1000);
        account.withdraw("1234",500);
        assertEquals(500, account.getBalance("1234"));
    }
    @Test
    public void withdraw_Negative_AmountTest(){
         account.deposit(300);
        assertThrows(IllegalArgumentException.class , ()-> account.withdraw("1234", 9000));
    }
    @Test
    public void withdraw_Money_TwiceFrom_AccountTest(){
        account.deposit(3000);
        account.withdraw("1234",1000);
        assertEquals(2000, account.getBalance("1234"));
        account.withdraw("1234",1000);
        assertEquals(1000, account.getBalance("1234"));
    }
}