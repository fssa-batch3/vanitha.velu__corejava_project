package day12.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import day06.practice.*;
import day11.solved.ConnectionUtil;

public class TaskDAO {

	public void createTask(Task task) throws DAOException {
        try (Connection connection = ConnectionUtil.getConnection();
             PreparedStatement stmt = connection
                     .prepareStatement("INSERT INTO tasklist (id, taskname, taskstatus) VALUES (?, ?, ?)")) {

            stmt.setInt(1, task.getId());
            stmt.setString(2, task.getTaskName());
            stmt.setString(3, task.getStatus());

            
            stmt.executeUpdate();
          
        } catch (SQLException e) {
            throw new DAOException("Error in createTask method", e);
        }
    }

    public void updateTask(Task task) throws DAOException {
        try (Connection connection = ConnectionUtil.getConnection()) {
           
            String query = "UPDATE tasklist SET taskname=?, taskstatus=? WHERE id=?";

            
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, task.getTaskName());
            pst.setString(2, task.getStatus());
            pst.setInt(3, task.getId());

           
            pst.executeUpdate();
          
        } catch (SQLException e) {
            throw new DAOException("Error in updateTask method", e);
        }
    }

    public void deleteTask(int taskId) throws DAOException {
        try (Connection connection = ConnectionUtil.getConnection();
             PreparedStatement stmt = connection.prepareStatement("DELETE FROM tasklist WHERE id=?")) {
            stmt.setInt(1, taskId);
          
            int rows = stmt.executeUpdate();
            System.out.println("No of rows deleted: " + rows);
            stmt.close();
          
        } catch (SQLException e) {
            throw new DAOException("Error in deleteTask method", e);
        }
    }

	public List<Task> getAllTasks() throws DAOException {
		List<Task> tasks = new ArrayList<>();

		try (Connection connection = ConnectionUtil.getConnection();
				PreparedStatement stmt = connection.prepareStatement("SELECT id, taskname, taskstatus FROM tasklist");
				ResultSet rs = stmt.executeQuery()) {

			while (rs.next()) {
				int taskId = rs.getInt("id");
				String taskName = rs.getString("taskname");
				String taskStatus = rs.getString("taskstatus");

				Task task = new Task(taskId, taskName, taskStatus);

				tasks.add(task);
			}

		} catch (SQLException e) {
			throw new DAOException("Error in getAllTasks method", e);
		}

		return tasks;
	}

	public static void main(String[] args) {
		TaskDAO taskDAO = new TaskDAO();

		Task task1 = new Task(2, "Conference", "Pending");
		Task task2 = new Task(3, "Task meet", "Completed");

		try {

			taskDAO.createTask(task1);
			taskDAO.createTask(task2);

			task1.setStatus("In Progress");
			taskDAO.updateTask(task1);

			int taskIdToDelete = 2;
			taskDAO.deleteTask(taskIdToDelete);

			List<Task> tasks = taskDAO.getAllTasks();

			for (Task task : tasks) {
				System.out.println(task);
			}
		} catch (DAOException e) {
			e.printStackTrace();
		}
	}
}