import java.util.Scanner;

class StudentConst {
    String name;
    String uid;
    int age;

    StudentConst() {
        Scanner take_input  = new Scanner(System.in);
        System.out.println("Enter the student's name: ");
        this.name = take_input.next();
        System.out.println("Enter the student's UID: ");
        this.uid = take_input.next();
        System.out.println("Enter the student's age: ");
        this.age = take_input.nextInt();
    }

    StudentConst(String name, String uid, int age) {
        this.name = name;
        this.uid = uid;
        this.age = age;
    }

    StudentConst(StudentConst student) {
        this.name = student.name;
        this.uid = student.uid;
        this.age = student.age;
    }

}

public class Student {
    public static void main(String[] args) {
        System.out.println("Code by Ritiek Malhotra");
        System.out.println("17BCS1752");
        System.out.println("");

        Scanner take_input  = new Scanner(System.in);

        StudentConst student1 = new StudentConst();
        System.out.println("Name: " + student1.name);
        System.out.println("UID : " + student1.uid);
        System.out.println("Age : " + student1.age);
        System.out.println("");

        System.out.println("Enter the student's name: ");
        String name = take_input.next();
        System.out.println("Enter the student's UID: ");
        String uid = take_input.next();
        System.out.println("Enter the student's age: ");
        int age = take_input.nextInt();

        StudentConst student2 = new StudentConst(name, uid, age);
        System.out.println("Name: " + student2.name);
        System.out.println("UID : " + student2.uid);
        System.out.println("Age : " + student2.age);
        System.out.println("");

        System.out.println("Passing student1 in copy constructor");
        StudentConst student3 = new StudentConst(student1);
        System.out.println("Name: " + student3.name);
        System.out.println("UID : " + student3.uid);
        System.out.println("Age : " + student3.age);
        System.out.println("");
    }
}