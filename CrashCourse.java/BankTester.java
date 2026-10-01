public class BankTester {
   public static void main(String[] args) {
      BankAccount alex = new BankAccount("Alex", 100);
      BankAccount jamie = new BankAccount("Jamie", 250);

      alex.deposit(50);

      alex.printInfo();
      jamie.printInfo();
   }
}