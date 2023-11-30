import java.io.*;
import java.util.Scanner;

public class student {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the menu
            System.out.println("1. Add Student");
            System.out.println("2. View Student Records");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            // Get user input for menu choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudentRecords();
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void addStudent() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("student_records.txt", true))) {
            Scanner scanner = new Scanner(System.in);

            // Get user input for student details
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student ID: ");
            String id = scanner.nextLine();

            System.out.print("Enter student grade: ");
            String grade = scanner.nextLine();

            // Write student details to the file
            writer.write(name + "," + id + "," + grade);
            writer.newLine();

            System.out.println("Student record added successfully.");
        } catch (IOException e) {
            System.err.println("Error while writing to the file: " + e.getMessage());
        }
    }

    private static void viewStudentRecords() {
        try (BufferedReader reader = new BufferedReader(new FileReader("student_records.txt"))) {
            String line;
            System.out.println("Student Records:");

            // Read and display student records from the file
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                System.out.println("Name: " + parts[0] + ", ID: " + parts[1] + ", Grade: " + parts[2]);
            }
        } catch (IOException e) {
            System.err.println("Error while reading from the file: " + e.getMessage());
        }
    }
}
