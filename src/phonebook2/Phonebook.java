package phonebook2;

public class Phonebook {
    private boolean isLocked = true;
    private String password;

    public Phonebook(String username,String password) {
        this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }
    public void unLockWith(String password){
        if (this.password.equalsIgnoreCase(password)){
            isLocked = false;
        }
    }
    public void lock(){
        isLocked = true;
    }
}
