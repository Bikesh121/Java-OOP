package Inheritance;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayStudent();
        System.out.println();

        Teacher t = new Teacher();
        t.displayTeacher();
        System.out.println();

        Principle p = new Principle();
        p.displayPrinciple();



    }
}
