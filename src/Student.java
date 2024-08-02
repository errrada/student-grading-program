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

    ArrayList<ArrayList<Integer>> grade = new ArrayList<ArrayList<Integer>>() {
        {
            add(new ArrayList<Integer>() {
                {
                    add(10);
                    add(9);
                    add(8);
                }
            });
            add(new ArrayList<Integer>() {
                {
                    add(7);
                    add(5);
                    add(8);
                    add(6);
                }
            });
            add(new ArrayList<Integer>() {
                {
                    add(10);
                    add(7);
                    add(2);
                    add(6);
                    add(3);
                }
            });
            add(new ArrayList<Integer>() {
                {
                    add(10);
                    add(10);
                    add(9);
                    add(10);
                }
            });
            add(new ArrayList<Integer>() {
                {
                    add(5);
                    add(3);
                    add(3);
                    add(8);
                }
            });
        }
    };

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
                    averageGrade();
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
        System.out.println();
        System.out.println("Add grade");
        System.out.println("To which student would you like to add grade?");
        System.out.println("------");
        System.out.println();

        for (String student : name) {
            System.out.println(student);
        }

        String nmgr = action.nextLine();
        int index = name.indexOf(nmgr);

        if (index != -1) {
            System.out.println();
            System.out.println("Current grades for " + nmgr + ": " + grade.get(index));
            System.out.println("Enter new grade:");
            int newGrade = action.nextInt();
            action.nextLine();
            grade.get(index).add(newGrade);
            System.out.println("Grade added. Updated grades for " + nmgr + ": " + grade.get(index));
            System.out.println();
        } else {
            System.out.println(nmgr + " not found in the list.");
        }
    }

    public void averageGrade() {
        System.out.println();
        System.out.println("Average grade");
        System.out.println("For which student would you like to calculate average grade?");
        System.out.println("------");
        System.out.println();

        for (String student : name) {
            System.out.println(student);
        }

        String nmavg = action.nextLine();
        int index = name.indexOf(nmavg);

        ArrayList<Integer> grades = grade.get(index);

        double avg = 0.0;

        if (grades.isEmpty()) {
            avg = 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        avg = sum / grades.size();

        if (index != -1) {
            System.out.println();
            System.out.println("Average grade for " + nmavg + " is: " + avg);
            System.out.println();
        } else {
            System.out.println(nmavg + " not found in the list.");
        }
    }
}
