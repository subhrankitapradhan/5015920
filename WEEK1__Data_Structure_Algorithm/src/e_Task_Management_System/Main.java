package e_Task_Management_System;

public class Main {
    public static void main(String[] args) {
        
        TaskLinkedList taskList = new TaskLinkedList();

        
        taskList.addTask(new Task(1, "Write proposal", "Pending"));
        taskList.addTask(new Task(2, "Develop prototype", "In Progress"));
        taskList.addTask(new Task(3, "Test application", "Pending"));
        taskList.addTask(new Task(4, "Deploy to production", "Pending"));

        
        System.out.println("All tasks:");
        taskList.traverseTasks();

        // Search for a specific task by ID
        int searchId = 2;
        Task foundTask = taskList.searchTask(searchId);
        if (foundTask != null) {
            System.out.println("\nTask found with ID " + searchId + ": " + foundTask);
        } else {
            System.out.println("\nTask with ID " + searchId + " not found.");
        }

        // Delete a task by ID
        int deleteId = 3;
        boolean isDeleted = taskList.deleteTask(deleteId);
        if (isDeleted) {
            System.out.println("\nTask with ID " + deleteId + " deleted successfully.");
        } else {
            System.out.println("\nTask with ID " + deleteId + " not found.");
        }

        // Traverse and display all tasks after deletion
        System.out.println("\nAll tasks after deletion:");
        taskList.traverseTasks();
    }
}
