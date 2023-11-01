package ie.atu;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        String name, email, course;
        // Part 1

        Student student1 = new Student();

        Scanner scanner = new Scanner(System.in);
        System.out.println("First Student; \n");
        System.out.println("Enter name: ");
        student1.setName(scanner.nextLine());

        System.out.println("Enter email: ");
        student1.setEmail(scanner.nextLine());

        System.out.println("Enter course: ");
        student1.setCourse(scanner.nextLine());

        // Part 2
        System.out.println("Second Student; \n");
        System.out.println("Enter name: ");
        Student student2 = new Student(scanner.nextLine());

        System.out.println("Enter email: ");
        student2.setEmail(scanner.nextLine());

        System.out.println("Enter course: ");
        student2.setCourse(scanner.nextLine());

        // Part 3
        System.out.println("Third Student; \n");
        System.out.println("Enter name: ");
        name = scanner.nextLine();

        System.out.println("Enter email: ");
        email = scanner.nextLine();

        System.out.println("Enter course: ");
        course = scanner.nextLine();

        Student student3 = new Student(name, email, course);

        // Display student1 info
        System.out.println("First Student; ");
        System.out.println("Name " + student1.getName() + "\nEmail: " + student1.getEmail() + "\nCourse: " + student1.getCourse()+ "\n");

        // Display student2 info
        System.out.println("Second Student; ");
        System.out.println("Name " + student2.getName() + "\nEmail: " + student2.getEmail() + "\nCourse: " + student2.getCourse() + "\n");

        // Display student3 info
        System.out.println("Third Student; ");
        student3.displayInfo();
    }
}