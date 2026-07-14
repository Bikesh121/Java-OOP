package Inheritance;

public class Student extends Person{
    int roll;
    float grade;

    Student(){
        super("Nima Dorje Lama", 18, "Chitwan");
        roll = 10;
        grade = 3.56f;
    }

    void displayStudent(){
        System.out.println("-----Student Details-----");
        super.displayPerson();
        System.out.println("Roll NO: "+roll);
        System.out.println("Grade: "+grade);
    }

}
