package Class_Object;
import java.util.Scanner;

public class Student {
    int id;
    String name;
    String faculty;
    float gpa;

    void displayStudent(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Faculty: "+faculty);
        System.out.println("GPA: "+gpa);
    }

    void checkResult(){
        if(gpa >= 2){
            System.out.println("Student has passed the Exam.");
        }
        else{
            System.out.println("Student has failed the Exam.");
        }
    }

    void academicStatus(){
        if(gpa >= 3.6){
            System.out.println("Academic Status: Excellent");
        }
        else if(gpa >= 2.8){
            System.out.println("Academic Status: Good");
        }
        else if(gpa >= 2){
            System.out.println("Academic Status: Average");
        }
        else{
            System.out.println("Academic Status: Poor");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[3];

        for(int i = 0; i < s.length; i++){
            s[i] = new Student();

            System.out.println("Enter details of Student ["+(i+1)+"]: ");

            System.out.print("ID: ");
            s[i].id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            s[i].name = sc.nextLine();

            System.out.print("Faculty: ");
            s[i].faculty = sc.nextLine();

            System.out.print("GPA: ");
            s[i].gpa = sc.nextFloat();
            sc.nextLine();

            System.out.println();
        }

        for(int i = 0; i < s.length; i++){
            System.out.println("Details of student ["+(i+1)+"]: ");
            s[i].displayStudent();
            s[i].checkResult();
            s[i].academicStatus();
            System.out.println();
        }

    }
}
