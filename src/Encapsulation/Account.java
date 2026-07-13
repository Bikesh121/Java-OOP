package Encapsulation;
import java.util.Scanner;

public class Account {
    private long balance;
    private int pin;

    Account(){
        balance = 200000;
        pin = 3233;
    }

    public void setBalance(long balance){
        this.balance = balance;
    }

    public long getBalance(){
        return balance;
    }

    public void setPin(int pin){
        this.pin = pin;
    }

    public int getPin(){
        return pin;
    }

    void deposit(long amount){
        if(amount > 0){
            setBalance(getBalance() + amount);
            System.out.println("Amount deposited successfully!");
        }
        else{
            System.out.println("Invalid amount!");
        }
    }

    void withdraw(long amount){
        if(amount <= balance && amount > 0){
            setBalance(getBalance() - amount);
            System.out.println("Amount withdrawn successfully!");
        }
        else{
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    void checkBalance(){
        System.out.println("Your current balance is Rs."+balance);
    }

    void changePin(int pin){
        int count = 0;
        int temp = pin;

        while(temp != 0){
            temp /= 10;
            count++;
        }
        if(count == 4){
            setPin(pin);
            System.out.println("Pin has been changed successfully!");
        }
        else{
            System.out.println("Length of pin must be 4!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account ac = new Account();

        int choice;
        long d_amount;
        long w_amount;
        int pin;
        int new_pin;

        do{
            System.out.println("------ATM Operations-----");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Change Pin");
            System.out.println("5.Exit");


            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter the deposit amount: ");
                    d_amount = sc.nextLong();

                    System.out.println("Enter pin: ");
                    pin = sc.nextInt();

                    if(pin == ac.getPin()){
                        ac.deposit(d_amount);
                    }
                    else{
                        System.out.println("Incorrect pin!");
                    }
                    break;

                case 2:
                    System.out.println("Enter the withdrawn amount: ");
                    w_amount = sc.nextLong();

                    System.out.println("Enter pin: ");
                    pin = sc.nextInt();

                    if(pin == ac.getPin()){
                        ac.withdraw(w_amount);
                    }
                    else{
                        System.out.println("Incorrect pin!");
                    }
                    break;

                case 3:
                    System.out.println("Enter pin: ");
                    pin = sc.nextInt();

                    if(pin == ac.getPin()){
                        ac.checkBalance();
                    }
                    else{
                        System.out.println("Incorrect pin!");
                    }
                    break;

                case 4:
                    System.out.println("Enter new pin: ");
                    new_pin = sc.nextInt();

                    System.out.println("Enter old pin to confirm: ");
                    pin = sc.nextInt();

                    if(pin == ac.getPin()){
                        ac.changePin(new_pin);
                    }
                    else{
                        System.out.println("Incorrect pin!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting.........");
                    break;

                default:
                    System.out.println("Invalid choice!");

            }


        } while (choice != 5);
    }
}
