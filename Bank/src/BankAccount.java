public class BankAccount {
    private double balance;
    private String accountNumber;
    private String ownerName;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber= accountNumber;
        this.ownerName = ownerName;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Du satte in " + amount);
        }else{
            System.out.println("Fel mängd pengar");
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }else{
            System.out.println("Du har inte så mycket pengar, tyvärr");
        }

    }
    public double checkBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public String getOwnerName(){
        return ownerName;
    }

}
