package day06.Test;

import java.util.ArrayList;

class addTask {
	private int taskId;
	private String taskName;
	private String description;

	// Constructor
	public addTask(int taskId, String taskName, String description) {
		this.taskId = taskId;
		this.taskName = taskName;
		this.description = description;
	} 

	@Override
	public String toString() {
		return "Task ID: " + taskId + ", Task Name: " + taskName + ", Description: " + description;
	} 
} 

public class Task {
	public static void main(String[] args) {

		ArrayList<addTask> taskList = new ArrayList<>();

		taskList.add(new addTask(1, "Finish report", "Complete the quarterly sales report."));
		taskList.add(new addTask(2, "Buy groceries", "Purchase items for the week."));
		taskList.add(new addTask(3, "Study for exam", "Prepare for the upcoming Java exam."));

		for (addTask task : taskList) {
			System.out.println(task);
		}
	}
}
