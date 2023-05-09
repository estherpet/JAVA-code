public class Account2 {
    private  String name;
    private String balance;
    private  String accountType;


    public Account2 (String name) {
        this.name = name;
    }

    public void setName (String name) {
       this.name = name;
    }
    public String getName () {
        return name;
    }
    public void setBalance(int balance){
        this.balance = String.valueOf(balance);
    }
    public int getBalance(){
        return Integer.parseInt(balance);
    }
    public void setAccountType(String accountType){
        this.accountType = accountType;
    }
    public String getAccountType(){
        return accountType;
    }

}


