package Bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    Bank bank;
@BeforeEach
public void oneTest(){
    bank = new Bank();
}
    @Test
    public void  registerNewCustomerTest() {
        bank.registerNewCustomer("pat","peter","1234", "08160243567");
        assertEquals(1,bank.accountSize());
    }
    @Test
    public void  depositMoneyTest() {
        bank.registerNewCustomer("pat", "peter", "1234", "08160243567");
        String acNumber = bank.accountNumber("08160243567");
        bank.deposit(acNumber, 5000);
        assertEquals(5000, bank.getBalance("08160243567","1234"));
    }
    @Test
    public void withdrawMoneyTest(){
    bank.registerNewCustomer("pat","peter","1234","08130468722");
    String acNumber = bank.accountNumber("08160243567");
    bank.deposit(acNumber,2000);


    }
}
