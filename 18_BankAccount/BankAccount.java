/* 
Swag Trio - Max Schneider, Jason Yang, Michael Kamela

DISCO:
You don't actually need a constructor. The default one is very effective
Variables should be private to ensure they don't accidently get changed in aanother instance

QCC:
Why is int randomly changing big numbers?
Q2: It must exist because we can call a new BankAccount without a constructor.
Q3: You could try calling the integer name, or run BankAccount(specific instance).greet(), when greet is a method that returns BankAccount.
*/





public class BankAccount {

        private String fullName;
        private String password;
        private int pin;
        private int accountNumber;
        private float balance;

        public void setValues(String S, String T, int a, int b, float f){
                fullName = S;
                password = T;
                pin = a;
                accountNumber = b;
                balance = f;
        }

        public void withdraw(float g){
                balance = balance - g;
        }
        public void deposit(float h) {
                balance = balance + h;
        }
        public void actInfo (){
                System.out.println("Account Name: " + fullName + " Password: "+ password + " Pin: " + pin + " Account Number: " + accountNumber + " Balance: " + balance);
        }
        public static void main(String[] args){
                BankAccount Test = new BankAccount();
                Test.setValues("Test Account", "StrongPassword", 123456789, 000, 1000);
                Test.withdraw(100);
                Test.deposit(200);
                Test.actInfo();
        }
}
