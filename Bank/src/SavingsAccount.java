public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accountNumber, String ownerName, double interestRate){
        super(accountNumber, ownerName);
        this.interestRate = interestRate;
    }
    public void addInterest(){
        double interest = checkBalance() * interestRate;
        deposit(interest);
        System.out.println("Räntan " + interest);
    }

}
