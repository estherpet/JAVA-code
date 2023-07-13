package phonebook2;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class phonebookTest {
    Phonebook phonebook = new Phonebook("username","password");
    @Test
    public void phonebookLockedByDefaultTest(){
        assertTrue(phonebook.isLocked());
    }
     @Test
    public void phonebookWithPassword(){
        assertTrue(phonebook.isLocked());
        phonebook.unLockWith("password");
        assertFalse(phonebook.isLocked());
  }


}