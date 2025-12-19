package Logic;

import java.time.LocalDate;

// TaskBuilder
// -----------
// Implements the Builder Pattern to construct Task objects step by step.
// Ensures mandatory fields are validated before task creation.
// Also integrates Factory and Prototype patterns internally.

public class TaskBuilder {

    private String title;
    private String type;
    private String assignedTo;
    private LocalDate deadline;

    // Builder Pattern

    // Constructor with mandatory task attributes
    // Validates required fields to prevent invalid task creation
    public TaskBuilder(String title, String type, String assignedTo) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Task title cannot be empty");
        }
        if (type == null) {
            throw new IllegalArgumentException("Task type cannot be null");
        }
        if (assignedTo == null) {
            throw new IllegalArgumentException("Task must be assigned for an employee.");
        }

        this.title = title.trim();
        this.type = type.toLowerCase();
        this.assignedTo = assignedTo;

    }

    // Optional builder method to set task deadline
    public TaskBuilder deadline(LocalDate deadline) {
        this.deadline = deadline;
        return this;
    }

    // Final build step
    // Creates the task object based on type (Factory Pattern)
    // Assigns workflow templates using Prototype Pattern
    public Task build() {
        Task task;

        // Factory Pattern
        // Creates specific Task subclass based on task type
        switch (type) {
            case "bug":
                task = new Bug(title);
                break;
            case "feature":
                task = new Feature(title);
                break;
            case "improvement":
                task = new Improvement(title);
                break;
            default:
                throw new IllegalArgumentException("Unknown task type: " + type);
        }

        // Prototype Pattern: Get the appropriate workflow for each type and copy it.
        var workflowTemplate = TaskWorkflowManager.getInstance().getWorkflowForType(type);
        task.setWorkflow(workflowTemplate); // مهم جدًا: يفعّل الحالات الخاصة بالنوع

        // Applying optional properties
        if (deadline != null) {
            task.setDeadline(deadline);
        }

        if (assignedTo != null) {
            task.setAssignedTo(assignedTo);
        }

        return task;
    }
}

// Classes that Represents a task type
// Inherits common behaviors from Task

class Improvement extends Task {
    public Improvement(String title) {
        super(title, "Improvement");
    }
}

class Bug extends Task {
    public Bug(String title) {
        super(title, "Bug");
    }
}

class Feature extends Task {
    public Feature(String title) {
        super(title, "Feature");
    }
}
