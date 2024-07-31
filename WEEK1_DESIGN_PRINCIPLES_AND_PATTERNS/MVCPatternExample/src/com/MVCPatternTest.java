package com;

public class MVCPatternTest {
    public static void main(String[] args) {
        // Create a new student
        Student model = new Student("1", "John Doe", "A");

        // Create a view to display student details
        StudentView view = new StudentView();

        // Create a controller
        StudentController controller = new StudentController(model, view);

        // Display the initial student details
        controller.updateView();

        // Update the student details
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("A+");

        // Display the updated student details
        controller.updateView();
    }
}

