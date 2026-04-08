import java.util.Scanner;
class Student {
    int rollNo;
    String name;
    float marks;
    Student next;

    Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.next = null;
    }
}

public class StudentManagementSystem {
    static Student head = null;
    public static void addStudent(int rollNo, String name, float marks) {
        Student newNode = new Student(rollNo, name, marks);
        newNode.next = head;
        head = newNode;
        System.out.println("Student added successfully!");
    }
    public static void searchStudent(int rollNo) {
        Student temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Student Found:");
                System.out.println("Roll No: " + temp.rollNo);
                System.out.println("Name: " + temp.name);
                System.out.println("Marks: " + temp.marks);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student not found.");
    }
    public static void deleteStudent(int rollNo) {
        Student temp = head, prev = null;
        if (temp != null && temp.rollNo == rollNo) {
            head = temp.next;
            System.out.println("Student deleted successfully!");
            return;
        }
        while (temp != null && temp.rollNo != rollNo) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Student not found.");
            return;
        }

        prev.next = temp.next;
        System.out.println("Student deleted successfully!");
    }
    public static void displayStudents() {
        Student temp = head;

        if (temp == null) {
            System.out.println("No records found.");
            return;
        }

        System.out.println("\nStudent List:");
        while (temp != null) {
            System.out.println("Roll No: " + temp.rollNo +
                               " | Name: " + temp.name +
                               " | Marks: " + temp.marks);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, rollNo;
        String name;
        float marks;

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    rollNo = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Enter Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    marks = sc.nextFloat();

                    addStudent(rollNo, name, marks);
                    break;

                case 2:
                    System.out.print("Enter Roll No to search: ");
                    rollNo = sc.nextInt();
                    searchStudent(rollNo);
                    break;

                case 3:
                    System.out.print("Enter Roll No to delete: ");
                    rollNo = sc.nextInt();
                    deleteStudent(rollNo);
                    break;

                case 4:
                    displayStudents();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}