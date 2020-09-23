// Q2. Lets create a bank account. Create a class named 'BankAccount' with the following data members
// 1 - Name of depositor
// 2 - Address of depositor
// 3 - Type of account
// 4 - Balance in account
// 5 - Number of transactions
// Class 'BankAccount' has a method for each of the following 
// 1 - Generate a unique account number for each depositor
// For first depositor, account number will be BA1000, for second depositor it will be BA1001 and so on
// 2 - Display information and balance of depositor
// 3 - Deposit more amount in balance of any depositor
// 4 - Withdraw some amount from balance deposited
// 5 - Change address of depositor
// After creating the class, do the following operations
// 1 - Enter the information (name, address, type of account, balance) of the depositors. Number of depositors are to be entered by user.
// 2 - Print the information of any depositor.
// 3 - Add some amount to the account of any depositor and then display final informaion of that depositor
// 4 - Remove some amount from the account of any depositor and then display final informaion of that depositor
// 5 - Change the address of any depositor and then display the final information of that depositor
// 6 - Randomly repeat these processes for some other bank accounts and after that print the total number of transactions.
// NOTE: Assume and Create more classes if Required

class BankAccount {
  private static int nextAccountNumber = 1000;
  private int transactions = 0;
  private double balance = 0;
  private String accountNumber;
  private String accountType;
  private String depositerName;
  private String depositerAddress;

  public BankAccount(String accTyp, String dNm, String dAdd, double initialBalance) {
    this.accountNumber = "BA" + nextAccountNumber++;
    this.accountType = accTyp;
    this.depositerName = dNm;
    this.depositerAddress = dAdd;
    this.balance = initialBalance;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public String getType() {
    return accountType;
  }

  public double getBalance() {
    return balance;
  }

  public String getAdress() {
    return depositerAddress;
  }

  public String getName() {
    return depositerName;
  }

  public int getTransactions() {
    return transactions;
  }

  public void deposit(double amount) {
    this.balance += amount;
    this.transactions += 1;
  }

  public boolean withdraw(double amount) {
    if (amount > balance) // refuse to let account be overdrawn
      return false;
    else {
      balance -= amount;
      this.transactions += 1;
      return true;
    }
  }

  public void updateAddress(String add) {
    this.depositerAddress = add;
  }
}

public class prog2 {
  public static void main(String[] args) {
    BankAccount SBI = new BankAccount("savings", "John", "123Street", 120);

    SBI.updateAddress("newStreet");
    SBI.deposit(5420);
    SBI.withdraw(40);

    System.out.println("Account No.: " + SBI.getAccountNumber());
    System.out.println("Account Type: " + SBI.getType());
    System.out.println("Depositor Name: " + SBI.getName());
    System.out.println("Depositor Address: " + SBI.getAdress());
    System.out.println("Balance : $" + SBI.getBalance());
    System.out.println("No. of Transactions: " + SBI.getTransactions());

    System.out.println("\nNEW ACCOUNT \n");

    BankAccount PNB = new BankAccount("current", "Pooh", "NaiGalli", 1080);

    PNB.deposit(49.5);

    System.out.println("Account No.: " + PNB.getAccountNumber());
    System.out.println("Account Type: " + PNB.getType());
    System.out.println("Depositor Name: " + PNB.getName());
    System.out.println("Depositor Address: " + PNB.getAdress());
    System.out.println("Balance : $" + PNB.getBalance());
    System.out.println("No. of Transactions: " + PNB.getTransactions());

  }
}
