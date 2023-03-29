import java.util.Scanner;

class Student {
    String regNo;
    String name;
    String email;
    String phone;
    String className;
    String department;

    public Student(String regNo, String name, String email, String phone, String className, String department) {
        this.regNo = regNo;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.className = className;
        this.department = department;
    }

    public void printDetails() {
        System.out.println("Reg. No.: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Class: " + className);
        System.out.println("Department: " + department);
    }
}

public class Lab_5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        int studentCount = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a student");
            System.out.println("2. Search for a student by registration number");
            System.out.println("3. Search for a student by name");
            System.out.println("4. Display all students");
            System.out.println("5. Quit");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("Enter registration number: ");
                String regNo = scanner.nextLine();

                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                System.out.print("Enter email: ");
                String email = scanner.nextLine();

                System.out.print("Enter phone: ");
                String phone = scanner.nextLine();

                System.out.print("Enter class: ");
                String className = scanner.nextLine();

                System.out.print("Enter department: ");
                String department = scanner.nextLine();

                Student student = new Student(regNo, name, email, phone, className, department);
                students[studentCount] = student;
                studentCount++;

                System.out.println("Student added successfully!");
            } else if (choice.equals("2")) {
                System.out.print("Enter registration number: ");
                String regNo = scanner.nextLine();

                boolean found = false;
                for (int i = 0; i < studentCount; i++) {
                    if (students[i].regNo.equals(regNo)) {
                        students[i].printDetails();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found!");
                }
            } else if (choice.equals("3")) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                boolean found = false;
                for (int i = 0; i < studentCount; i++) {
                    if (students[i].name.equals(name)) {
                        students[i].printDetails();
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("No more students with this name!");
                }
            } else if (choice.equals("4")) {
                for (int i = 0; i < studentCount; i++) {
                    students[i].printDetails();
                }
            } else if (choice.equals("5")) {
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
}