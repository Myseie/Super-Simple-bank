public class Main {
    public static void main(String[] args) {
        SavingsAccount mySavingsAccount = new SavingsAccount("1234", "Emil Westerholm", 0.40);

        mySavingsAccount.deposit(1000);
        System.out.println("Mitt saldo:"+ mySavingsAccount.checkBalance());

      mySavingsAccount.withdraw(200);
      System.out.println("Mitt saldo nu :" + mySavingsAccount.checkBalance());


      mySavingsAccount.addInterest();
        System.out.println("Mitt saldo efter räntan: "+ mySavingsAccount.checkBalance());

    }
}