import java.util.ArrayList;
import java.util.Scanner;

public class ToDoApp {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- To-Do List App ---");
            System.out.println("1. View To-Do List");
            System.out.println("2. Add Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("\nYour To-Do List:");
                    if (toDoList.isEmpty()) {
                        System.out.println("No tasks available!");
                    } else {
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter a new task: ");
                    String task = scanner.nextLine();
                    toDoList.add(task);
                    System.out.println("Task added!");
                    break;
                case 3:
                    System.out.println("Enter the number of the task to remove: ");
                    int taskNumber = scanner.nextInt();
                    if (taskNumber > 0 && taskNumber <= toDoList.size()) {
                        toDoList.remove(taskNumber - 1);
                        System.out.println("Task removed!");
                    } else {
                        System.out.println("Invalid task number!");
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}