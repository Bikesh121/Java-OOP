package Abstraction;

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone{
    void sendMessage(){
        System.out.println("Sending message...");
    }

    void playMusic(){
        System.out.println("Playing music...");
    }

    public void ring(){
        System.out.println("Ringing...");
    }

    public void lift(){
        System.out.println("Lifting...");
    }

    public void disconnect(){
        System.out.println("Disconnecting...");
    }
}

public class MyPhone{
    public static void main(String[] args) {
        Telephone phone = new SmartTelephone();

        phone.disconnect();
        phone.lift();
        phone.ring();

        //phone.sendMessage();  -->Not allowed
        //phone.playMusic(); -->Not allowed
    }
}