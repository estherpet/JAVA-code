package phoneBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    PhoneBook phoneBook;
    @BeforeEach
    public void test(){
        phoneBook = new PhoneBook();
    }
    @Test
    public void createContactTest(){
        phoneBook.createContact("ken","paul","08130468722");
        assertEquals(1,phoneBook.ContactSize());
    }
    @Test
    public void deleteContactTest(){
        phoneBook.createContact("Desire","pat","08154326789");
        phoneBook.createContact("john","divine","09061705839");
        phoneBook.createContact("thera","vera","09130468134");
        phoneBook.DeleteContact("pat");
        assertEquals(2,phoneBook.ContactSize());
    }
    @Test
    public void findContactTest(){
        phoneBook.createContact("favour","james","09067865755");
        phoneBook.createContact("favour","pat","08154326789");
        phoneBook.createContact("favour","desire","09061705839");
        phoneBook.createContact("lehi","favour","09130468134");
//        assertEquals(3,phoneBook.findContact("favour"));
        }
        @Test
    public void updateContactTest(){
        phoneBook.createContact("faith","stella","07089657489");
        phoneBook.createContact("samson","simon","09134567678");
        phoneBook.findContact("faith");
        phoneBook.updateContact("faith","martha");
//        assertEquals("07089657489 martha stella", phoneBook.searchContact("martha"));
        }
    }

