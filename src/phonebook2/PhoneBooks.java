package phonebook2;

import java.util.ArrayList;
import java.util.List;

public class PhoneBooks {
    List<Phonebook> phonebooks = new ArrayList<>();
    private  List<String> passwords = new ArrayList<>();

    public List<Phonebook> createPhoneBook(String username,String password){
        ArrayList <Phonebook> phonebooks1 = new ArrayList<>();
        Phonebook phonebook = new Phonebook(username,password);
        phonebooks.add(new Phonebook("username","password"));
        phonebooks.add(phonebook);
        return phonebooks1;
    }
    public List<Phonebook> getAllPhonebook(String password){
        return phonebooks;
    }
    public void unlockAllPhonebooks(){
        for (int index = 0; index < phonebooks.size(); index++) {
getAllPhonebook("password").get(index).unLockWith(passwords.get(index));
        }
    }

}
