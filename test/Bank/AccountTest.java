package Bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account queenieAccount = new Account("Esther","Peter", "1234");
    @Test
    public void accountExistTest(){
        assertNotNull(queenieAccount);
    }
    @Test
    public void deposit_MoneyTest(){
        queenieAccount.deposit(1000);
        assertEquals(1000,queenieAccount.getBalance("1234"));
    }
    @Test
    public void deposit_Negative_MoneyTest(){
        queenieAccount.deposit(1000);
        queenieAccount.deposit(-5000);
        assertEquals(1000,queenieAccount.getBalance("1234"));
    }
    @Test
    public void Withdraw_MoneyTest(){
        queenieAccount.deposit(1000);
        queenieAccount.withdraw("1234",500);
        assertEquals(500,queenieAccount.getBalance("1234"));
    }
    @Test
    public void withdraw_Negative_AmountTest(){
        queenieAccount.deposit(2000);
        queenieAccount.withdraw("2344",-1000);
        assertEquals(2000,queenieAccount.getBalance("2344"));
    }
    @Test
    public void withdraw_Money_TwiceFrom_AccountTest(){
        queenieAccount.deposit(3000);
        queenieAccount.withdraw("1234",1000);
        assertEquals(2000,queenieAccount.getBalance("1234"));
        queenieAccount.withdraw("1234",1000);
        assertEquals(1000,queenieAccount.getBalance("1234"));
    }
}