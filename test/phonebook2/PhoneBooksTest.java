package phonebook2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public  class PhoneBooksTest {
    PhoneBooks phoneBooks = new PhoneBooks();
    @Test
    public  void createPhonebooksTest(){
//        PhoneBooks phoneBooks = new PhoneBooks();
        phoneBooks.createPhoneBook("username","password");
        assertTrue(phoneBooks.getAllPhonebook("password").size()== 1);
    }
    @Test
    public void unlockAllPhonebooksTest(){
        phoneBooks.createPhoneBook("username","password");
        phoneBooks.createPhoneBook("username","password");
        phoneBooks.unlockAllPhonebooks();

        }
    }
