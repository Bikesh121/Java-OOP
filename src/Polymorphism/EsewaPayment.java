package Polymorphism;

public class EsewaPayment extends Payment{

    @Override
    void pay(double amount){
        System.out.println("Payment RS."+amount+" is done through Esewa.");
    }
}
