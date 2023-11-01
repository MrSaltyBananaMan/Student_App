package ie.atu;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        // Part 1 Complete

        Student student1 = new Student();

        Scanner scanner = new Scanner(System.in);
        System.out.println("First Student; \n");
        System.out.println("Enter name: ");
        student1.setName(scanner.nextLine());

        System.out.println("Enter email: ");
        student1.setEmail(scanner.nextLine());

        System.out.println("Enter course: ");
        student1.setCourse(scanner.nextLine());

        System.out.println("First Student; ");
        System.out.println("Name " + student1.getName() + "\nEmail: " + student1.getEmail() + "\nCourse: " + student1.getCourse()+ "\n");
    }
}