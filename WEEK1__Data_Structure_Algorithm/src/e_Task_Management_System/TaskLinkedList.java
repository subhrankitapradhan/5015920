package e_Task_Management_System;

public class TaskLinkedList {
    private TaskNode head;

    public TaskLinkedList() {
        this.head = null;
    }

    // Add a task to the list
    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search for a task by ID
    public Task searchTask(int taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null; // Task not found
    }

    // Traverse the list
    public void traverseTasks() {
        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete a task by ID
    public boolean deleteTask(int taskId) {
        if (head == null) {
            return false; // List is empty
        }

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return true; // Task deleted
        }

        TaskNode current = head;
        while (current.next != null) {
            if (current.next.task.getTaskId() == taskId) {
                current.next = current.next.next;
                return true; // Task deleted
            }
            current = current.next;
        }
        return false; // Task not found
    }
}

