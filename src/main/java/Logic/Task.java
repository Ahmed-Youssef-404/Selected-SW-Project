package Logic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// Task (Abstract Class)
// --------------------
// Represents the base abstraction for all task types in the system.
// Implements Cloneable to support the Prototype Pattern.
// Contains common task properties and workflow logic.

public abstract class Task implements Cloneable {

    // Static counter to generate unique IDs for each task
    private static int idCounter = 1;

    protected int id;
    protected String title;
    protected String type;
    protected String assignedTo;
    protected LocalDate deadline;
    protected String currentStatus;

    // Represents the task workflow (ordered statuses)
    // LinkedHashMap is used to preserve status order
    protected Map<String, Boolean> workflow = new LinkedHashMap<>();

    // Protected constructor to restrict direct instantiation
    // Task objects should be created using TaskBuilder
    protected Task(String title, String type) {
        this.id = idCounter++;
        this.title = title;
        this.type = type;
        // الـ workflow هيتعبأ من TaskBuilder بعدين
        // لكن عشان currentStatus ميبقاش null، هنحط قيمة مؤقتة
        this.currentStatus = "Pending";
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getAssignedTo() {
        return assignedTo != null ? assignedTo : "Unassigned";
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setAssignedTo(String user) {
        this.assignedTo = user;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    // Moves the task to the next status in the workflow
    // If the task is already in the final state, no change occurs
    public void nextStatus() {
        if (workflow.isEmpty() || currentStatus == null)
            return;

        List<String> statuses = new ArrayList<>(workflow.keySet());
        int currentIndex = statuses.indexOf(currentStatus);

        if (currentIndex == -1 || currentIndex == statuses.size() - 1) {
            // لو وصل للآخر أو مش لاقي الحالة الحالية
            return;
        }

        currentStatus = statuses.get(currentIndex + 1);
    }

    @Override

    // Prototype Pattern
    // Creates a copy of the task with a new unique ID
    // Resets the status to the first workflow state
    public Task clone() {
        try {
            Task cloned = (Task) super.clone();
            cloned.id = idCounter++;
            cloned.currentStatus = cloned.workflow.keySet().iterator().next();
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Object[] toRow() {
        String deadlineStr = deadline != null ? deadline.toString() : "No deadline";
        return new Object[] { id, title, type, getAssignedTo(), currentStatus, deadlineStr };
    }

    // Assigns a workflow template to the task
    // A copy is used to prevent shared references between tasks
    protected void setWorkflow(Map<String, Boolean> wf) {
        this.workflow = new LinkedHashMap<>(wf);
        if (!wf.isEmpty()) {
            this.currentStatus = wf.keySet().iterator().next(); // أول حالة
        }
    }
}