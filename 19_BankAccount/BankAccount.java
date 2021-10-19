/* 
Swag Trio - Max Schneider, Jason Yang, Michael Kamela

DISCO:
toString() can turn an object into a string representation

QCC:
Why do we have to say "short" when initializing a short value?
Why are we creating oldValue and returning it? Can't we just return the instance variable that was assigned a value?
*/

public class BankAccount {

  //instance variables
  private String name;
  private String passwd;
  private short pin;
  private int acctNum;
  private double balance;
  //---------------------------------------------


  //mutators
  public String setName( String newName ) {
    String oldName = name;
    name = newName;
    return oldName;
  }

  public String setPasswd( String newPasswd ) {
    String oldPasswd = passwd;
    passwd = newPasswd;
    return oldPasswd;
  }

  public short setPin( short newPin ) {
    short oldPin = pin;
    if (newPin <= 9998 && newPin >= 1000){
        pin = newPin;
    }   else {
        pin = 9999;
        System.out.println("Pin should be between 1000 and 9998. Your pin has been set to 9999.");
    }
    return oldPin;
  }

  public int setAcctNum( int newAcctNum ) {
    int oldAcctNum = acctNum;
    if (newAcctNum <= 999999998 && newAcctNum >=100000000){
        acctNum = newAcctNum;
    }   else {
        acctNum = 999999999;
        System.out.println("Account Number must be between 100000000 and 999999998. Your account number has been set to 999999999");
    }
    return oldAcctNum;
  }

  public double setBalance( double newBalance ) {
    double oldBalance = balance;
    balance = newBalance;
    return oldBalance;
  }
  //---------------------------------------------


  public void deposit( double depositAmount ) {
    balance = balance + depositAmount;
  }

  public boolean withdraw( double withdrawAmount ) {
    if (withdrawAmount <= balance) {
        balance = balance - withdrawAmount;
        return true;
    }   else{
        System.out.println("Error: Insufficient funds to withdraw.");
        return false;
    }
  }
  
  public boolean authenticate (int an, String pw){
      if (an == acctNum && pw == passwd){
          return true;
      }     else {
          return false;
      }
  }


  //overwritten toString()
  public String toString() {
    String retStr = "\nAccount info:\n=======================";
    retStr = retStr + "\nName: " + name;
    retStr = retStr + "\nPassword: " + passwd;
    retStr = retStr + "\nPIN: " + pin;
    retStr = retStr + "\nAccount Number: " + acctNum;
    retStr = retStr + "\nBalance: " + balance;
    retStr = retStr + "\n=======================";
    return retStr;
  }


  //main method for testing
  public static void main( String[] args ) {
    // INSERT YOUR METHOD CALLS FOR TESTING HERE
    BankAccount ba = new BankAccount();
    ba.setName("joeaccount");
    ba.setAcctNum(123456789);
    ba.setPasswd("StrongPassword");
    ba.setPin((short) 1234);
    ba.setBalance(1000);
    ba.withdraw(100);
    ba.deposit(200);
    ba.authenticate(123456789, "StrongPassword");
    System.out.println(ba.toString());  //all valid stuff
    
  
    ba.setName("joeaccount");
    ba.setAcctNum(12345); //invalid account number - sets account number to 999999999
    ba.setPasswd("StrongPassword");
    ba.setPin((short) 12); //invalid pin number - sets pin number to 9999
    ba.setBalance(1000);
    ba.withdraw(10000); //can't withdraw 10000 - error message
    ba.deposit(200);
    ba.authenticate(123456789, "StrongPassword");
    System.out.println(ba.toString());
    
    ba.setName("joeaccount");
    ba.setAcctNum(123456789);
    ba.setPasswd("StrongPassword");
    ba.setPin((short) 1234);
    ba.setBalance(1000);
    ba.withdraw(100);
    ba.deposit(200);
    ba.authenticate(12, "Strong"); //returns false
    System.out.println(ba.toString());
    
    
    
    
  }//end main()

}//end class BankAccount