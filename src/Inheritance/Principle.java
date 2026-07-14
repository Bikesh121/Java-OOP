package Inheritance;

public class Principle extends Person{
    int experience;

    Principle(){
        super("Jharendra Ghimire", 35, "KTM");
        experience = 12;
    }
    void displayPrinciple(){
        System.out.println("-----Principle Details-----");
        super.displayPerson();
        System.out.println("Years of Experience: "+experience);
    }
}
