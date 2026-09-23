class Person {
    String name = "Arun";
    int age = 20;

    // Parent class method
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class
class Student extends Person {
    int rollNo = 101;
    String department = "Computer Science";

    // Child class method
    void displayStudent() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("----- Person Details -----");
        s.displayPerson();

        System.out.println("\n----- Student Details -----");
        s.displayStudent();
    }
}