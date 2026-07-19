package Polymorphism;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payment payment;

        System.out.println("Enter the amount: ");
        double amount = sc.nextInt();

        System.out.println("-----Payment Method-----");
        System.out.println("1. Esewa");
        System.out.println("2. Khalti");
        System.out.println("3. Card");

        int choice;

        System.out.println("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice){
            case 1:
                payment = new EsewaPayment();
                payment.pay(amount);
                break;

            case 2:
                payment = new KhaltiPayment();
                payment.pay(amount);
                break;

            case 3:
                payment = new CardPayment();
                payment.pay(amount);
                break;

            default:
                System.out.println("Invalid choice!");
        }

    }
}
