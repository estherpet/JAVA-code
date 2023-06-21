package phoneBook;
import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private ArrayList <Contact> contacts = new ArrayList<>();

    public Contact createContact(String firstname,String lastname,String number) {
        Contact contact = new Contact(firstname, lastname, number);
        contacts.add(contact);
        return contact;
    }

    public int ContactSize() {
        return contacts.size();
    }

    public void DeleteContact(String name) {
        for (Contact contact: contacts){
            if (name.equals(name)){
             contacts.remove(contact);
         break;
            }
        }

    }

    public List <Contact> findContact(String name) {
        ArrayList <Contact> contacts1 = new ArrayList<>();
        for (Contact contact : contacts){
            if (contact.getFirstname().equals(name)){
                contacts1.add(contact);
            }
        }
        System.out.println(contacts1);
        return contacts1;
    }
}
