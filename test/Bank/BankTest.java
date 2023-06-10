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
        String acNumber = bank.accountNumber("8160243567");
        bank.deposit(acNumber, 5000);
        assertEquals(5000, bank.getBalance(acNumber,"1234"));
    }
    @Test
    public void  cannotDepositNegativeMoneyTest(){
    bank.registerNewCustomer("samson","david","1234","09056666005");
    String acNumber = bank.accountNumber("9056666005");
    bank.deposit(acNumber,-4000);
    assertEquals(0,bank.getBalance(acNumber,"1234"));
    }
    @Test
    public void withdrawMoneyTest(){
    bank.registerNewCustomer("pat","peter","1234","9160552522");
    String acNumber = bank.accountNumber("9160552522");
    bank.deposit(acNumber,5000);
    assertEquals(5000,bank.getBalance(acNumber,"1234"));
    bank.withdraw(acNumber,2000,"1234");
    assertEquals(3000,bank.getBalance(acNumber,"1234"));
    }
    @Test
    public void  cannotWithdrawNegativeAmountTest(){
    bank.registerNewCustomer("paul","paulina","3455","08956788567");
    String acNumber = bank.accountNumber("8956788567");
    bank.deposit(acNumber,5000);
    assertEquals(5000,bank.getBalance(acNumber,"3455"));
    bank.withdraw(acNumber,-0,"3455");
    assertEquals(5000,bank.getBalance(acNumber,"3455"));
    }
    @Test
    public void transferMoneyTest(){
    bank.registerNewCustomer("queenie","diamond","1234","9160255542");
    String senderAcNumber = bank.accountNumber("9160255542");
    bank.registerNewCustomer("sonia","joe","3456","7068564545");
    String receiverAcNumber = bank.accountNumber("7068564545");
    bank.deposit(senderAcNumber,5000);
    bank.transfer(senderAcNumber,receiverAcNumber,2000,"1234");
    assertEquals(2,bank.accountSize());
    assertEquals(3000,bank.getBalance(senderAcNumber,"1234"));
    assertEquals(2000,bank.getBalance(receiverAcNumber,"3456"));
    }


}
