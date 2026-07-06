package Constructor;

public class BankAccount {
    int accNumber;
    String accHolder;
    int balance;
    String accType;

    BankAccount(){
        accNumber = 1001;
        accHolder = "Unknown";
        accType = "Saving";
        balance = 0;
    }

    BankAccount(int accNumber, String accHolder, String accType, int balance){
        this.accNumber = accNumber;
        this.accHolder = accHolder;
        this.accType = accType;
        this.balance = balance;
    }

    BankAccount(int accNo, String name){
        this(accNo, name, "Saving", 0);
    }

    void deposit(int amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount RS."+amount+" deposited successfully!");
        }
        else{
            System.out.println("Invalid amount!");
        }
    }

    void withdraw(int amount){
        if(amount <= 0){
            System.out.println("Invalid amount!");
        }
        else if(amount > balance){
            System.out.println("Insufficient balance!");
        }
        else{
            balance -= amount;
            System.out.println("Withdrawal successful!");
        }
    }

    void display(){
        System.out.println("Account Number: "+accNumber);
        System.out.println("Holder Name: "+accHolder);
        System.out.println("Account Type: "+accType);
        System.out.println("Balance: "+balance);
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();

        BankAccount a2 = new BankAccount(11543275, "Bikesh Ghimire", "Current", 200000);

        BankAccount a3 = new BankAccount(24116722, "Jharendra Ghimire");


        a1.deposit(50000);
        a1.withdraw(20000);
        System.out.println("-----Account Details-----");
        a1.display();
        System.out.println();


        a2.deposit(25000);
        a2.withdraw(10000);
        System.out.println("-----Account Details-----");
        a2.display();
        System.out.println();


        a3.deposit(100000);
        a3.withdraw(50000);
        System.out.println("-----Account Details-----");
        a3.display();
    }


}
