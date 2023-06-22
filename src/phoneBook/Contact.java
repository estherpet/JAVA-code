package phoneBook;

public class Contact {
    private String firstname;
    private String lastname;
    private String phoneNumber;


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Contact(String name, String lastname, String number) {
        this.firstname = name;
        this.lastname = lastname;
        phoneNumber = number;
    }
    @Override
    public String toString(){
        return phoneNumber  +  " "  + firstname + " " +  lastname;
    }

}
