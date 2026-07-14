package Inheritance;

public class Teacher extends Person{
    String subject;
    int salary;

    Teacher(){
        super("Bikesh Ghimire", 32, "Jhapa");
        subject = "Math";
        salary = 92000;
    }

    void displayTeacher(){
        System.out.println("-----Teacher Details-----");
        super.displayPerson();
        System.out.println("Subject: "+subject);
        System.out.println("Salary: "+salary);
    }

}
