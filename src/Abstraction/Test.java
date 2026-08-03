package Abstraction;

abstract class Pen {

    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{

    void changeNib(){
        System.out.println("Changing a nib...");
    }

    void write(){
        System.out.println("Writing using pen...");
    }

    void refill(){
        System.out.println("Refilling a pen...");
    }
}

public class Test{
    public static void main(String[] args) {
        FountainPen myPen = new FountainPen();

        myPen.write();
        myPen.refill();
        myPen.changeNib();
    }
}
