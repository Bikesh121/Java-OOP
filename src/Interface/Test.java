package Interface;

interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{

    void jump(){
        System.out.println("Jumping...");
    }

    void bite(){
        System.out.println("Biting...");
    }
}

class Human extends Monkey implements BasicAnimal{

    void speak(){
        System.out.println("Hello! Everyone");
    }

    public void eat(){
        System.out.println("Eating...");
    }

    public void sleep(){
        System.out.println("Sleeping...");
    }
}

public class Test {
    public static void main(String[] args) {
        Human h = new Human();
        Monkey m = new Human();

        h.speak();
        h.eat();
        h.sleep();

        //Demonstrating polymorphism using monkey class
        m.jump();
        m.bite();
        //m.eat();  --> Not allowed
        //m.sleep();  -->Not allowed
        //m.speak();  -->Not allowed
    }
}
