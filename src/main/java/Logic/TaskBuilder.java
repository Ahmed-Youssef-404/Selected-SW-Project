package Logic;

import java.time.LocalDate;

public class TaskBuilder {

    private String title;
    private String type;
    private String assignedTo;
    private LocalDate deadline;

    // البناء الأساسي: العنوان + النوع (إجباري)
    public TaskBuilder(String title, String type) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Task title cannot be empty");
        }
        if (type == null) {
            throw new IllegalArgumentException("Task type cannot be null");
        }

        this.title = title.trim();
        this.type = type.toLowerCase();
    }

    // اختياري: مين مسؤول عن المهمة
    public TaskBuilder assignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }

    // اختياري: ميعاد التسليم
    public TaskBuilder deadline(LocalDate deadline) {
        this.deadline = deadline;
        return this;
    }

    // الخطوة الأخيرة: بناء المهمة النهائية
    public Task build() {
        Task task;

        // إنشاء المهمة حسب النوع (Factory داخلي)
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

        // Prototype Pattern: جلب الـ Workflow المناسب لكل نوع ونسخه
        var workflowTemplate = TaskWorkflowManager.getInstance().getWorkflowForType(type);
        task.setWorkflow(workflowTemplate); // مهم جدًا: يفعّل الحالات الخاصة بالنوع

        // تطبيق الخصائص اختيارية
        if (assignedTo != null && !assignedTo.isEmpty()) {
            task.setAssignedTo(assignedTo);
        }
        if (deadline != null) {
            task.setDeadline(deadline);
        }

        return task;
    }
}