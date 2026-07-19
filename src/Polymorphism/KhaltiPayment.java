package Polymorphism;

public class KhaltiPayment extends Payment{

    @Override
    void pay(double amount){
        System.out.println("Payment RS."+amount+" is done through Khalti.");
    }
}
