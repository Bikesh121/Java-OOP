package Polymorphism;

public class CardPayment extends Payment{

    @Override
    void pay(double amount){
        System.out.println("Payment RS."+amount+" is done through your Card.");
    }
}
