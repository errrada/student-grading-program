<<<<<<< HEAD
import java.util.Scanner;
import java.util.ArrayList;

public class Student {
    ArrayList<String> name = new ArrayList<String>() {
        {
            add("Laura");
            add("Mark");
            add("Jack");
            add("Tom");
            add("Maria");
        }
    };
    int[][] grade = { { 10, 9, 8 }, { 7, 5, 8, 6 }, { 10, 7, 2, 6, 3 }, { 10, 10, 9, 10 }, { 5, 3, 3, 8 } };
    Scanner action = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Student grades management system");

        Student ch = new Student();
        ch.menu();
    }

    public void menu() {
        while (true) {
            System.out.println("Input a number for your action:");
            System.out.println("1. See student list");
            System.out.println("2. Add grade");
            System.out.println("3. Calculate average grade");
            System.out.println("4. Exit");
            System.out.println("------");

            int choice = action.nextInt();
            action.nextLine();

            switch (choice) {
                case 1:
                    studentList();
                    break;
                case 2:
                    addGrade();
                    break;
                case 3:
                    // averageGrade();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    action.close();
                    return;
                default:
                    System.out.println("No such choice.");
                    break;
            }
        }
    }

    public void studentList() {
        System.out.println("See student list");
        System.out.println("------");
        System.out.println();

        for (String student : name) {
            System.out.println(student);
        }

        System.out.println();
        System.out.println("1. Add student");
        System.out.println("2. Delete student");
        System.out.println("3. Back to menu");
        System.out.println("------");
        System.out.println();

        int choice = action.nextInt();
        action.nextLine();

        switch (choice) {
            case 1:
                addStudent();
                break;
            case 2:
                deleteStudent();
                break;
            case 3:
                menu();
                break;
            default:
                System.out.println("No such choice.");
                break;
        }
        action.close();
    }

    public void addStudent() {
        System.out.println();
        System.out.println("Add student");
        System.out.println("Input student name:");
        System.out.println("------");
        System.out.println();

        String nma = action.nextLine();
        name.add(nma);

        studentList();
    }

    public void deleteStudent() {
        System.out.println();
        System.out.println("Delete student");
        System.out.println("Select which student to delete:");
        System.out.println("------");
        System.out.println();

        String nmd = action.nextLine();

        if (name.remove(nmd)) {
            System.out.println(nmd + " has been removed.");
        } else {
            System.out.println(nmd + " not found in the list.");
        }

        studentList();
    }

    public void addGrade() {

    }
}
=======
import java.util.Scanner;

public class Student {
    String[] name = { "Laura", "Mark", "Jack", "Tom", "Maria" };
    int[][] grade = { { 10, 9, 8 }, { 7, 5, 8, 6 }, { 10, 7, 2, 6, 3 }, { 10, 10, 9, 10 }, { 5, 3, 3, 8 } };

    public static void main(String[] args) throws Exception {
        System.out.println("Student grades management system");

        Student ch = new Student();
        ch.menu();
    }

    public void menu() {

        System.out.println("Input a number for your action:");
        System.out.println("1. See student list");
        System.out.println("2. Add grade");
        System.out.println("3. Calculate average grade");
        System.out.println("------");

        Scanner action = new Scanner(System.in);
        int choice = action.nextInt();

        Student stud = new Student();

        switch (choice) {
            case 1:
                stud.studentList();
                break;
            case 2:
                // stud.addGrade();
                break;
            case 3:
                // stud.averageGrade();
                break;
            default:
                System.out.println("No such choice.");
                break;
        }
        action.close();

    }

    public void studentList() {
        System.out.println("See student list");
        System.out.println();

        int count = name.length;

        for (int i = 0; i < count; i++) {
            System.out.println(i + 1 + ". " + name[i]);
        }

        System.out.println();
        System.out.println("1. Add student");
        System.out.println("2. Delete student");
        System.out.println("3. Back to menu");

        Scanner action = new Scanner(System.in);
        int choice = action.nextInt();

        Student stud = new Student();

        switch (choice) {
            case 1:
                stud.addStudent();
                break;
            case 2:

                break;
            case 3:

                break;
            default:
                System.out.println("No such choice.");
                break;
        }
        action.close();
    }

    public void addStudent() {
        System.out.println("Add student");
        System.out.println("Input student name:");

        Scanner action = new Scanner(System.in);
        String nm = action.nextLine();
        action.close();

        int add = name.length;
        name[add + 1] = nm;

        studentList();
    }
}
>>>>>>> 3a429b8c84e341c17337ab0ab793a0f314416e9c
