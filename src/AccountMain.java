public class AccountMain {
    public static void main(String[] args) {
        Account2 user = new Account2("Timi");
        Account2 user2= new Account2("ESTHER");

        System.out.println(user.getName());
        String myName = user.getName();
        System.out.println(myName);
        System.out.println(user2.getName());
    }
}
