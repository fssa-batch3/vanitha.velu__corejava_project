package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task {
    private String name;
    private String deadline;

    public Task(String name, String deadline) {
        this.name = name;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public String getDeadline() {
        return deadline;
    }

    public String toString() {
        return "Task: " + name + ", Deadline: " + deadline;
    }

    public static void main(String[] args) {
        // Create an ArrayList of Task
        List<Task> taskList = new ArrayList<>();

        // Add tasks with the same name and deadline
        taskList.add(new Task("Task 1", "2023-07-20"));
        taskList.add(new Task("Task 2", "2023-07-21"));
        taskList.add(new Task("Task 1", "2023-07-20"));
        taskList.add(new Task("Task 3", "2023-07-22"));
        taskList.add(new Task("Task 2", "2023-07-21"));

        // Print the ArrayList before removing duplicates
        System.out.println("ArrayList before removing duplicates:");
        for (Task task : taskList) {
            System.out.println(task);
        }

        // Create a HashSet of Task to remove duplicates
        Set<Task> taskSet = new HashSet<>(taskList);

        // Clear the ArrayList
        taskList.clear();

        // Add the unique tasks back to the ArrayList
        taskList.addAll(taskSet);

        // Print the ArrayList after removing duplicates
        System.out.println("\nArrayList after removing duplicates:");
        for (Task task : taskList) {
            System.out.println(task);
        }
    }
}
