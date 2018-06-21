// + - open reset interest (balance transfer)
//BigDecimal

public class BankAccount{
  private double balance;
  private String log;
  
  public BankAccount(){}
  public BankAccount(double initialBalance){}
  
  public void deposit(double amount){
    balance = balance + amount;
    log = log + "+" + amount + "  "; 
  }
  
  public void withdraw(double amount){ 
    balance = balance - amount;
    log = log + "-" + amount + "  "; 
   
  }
  
  public double getBalance(){return 0;}
  
  
//harrysChecking.withdraw(harrysChecking.getBalance())
  
  /**
   BankAccount with number and initial balance
   */
  
  /**
   
   * /
  
}