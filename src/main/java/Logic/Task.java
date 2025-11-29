package Logic;
public abstract class Task {

    protected String title;
    protected String type;
    protected String assignedTo;
    protected String status;

    public Task(String title, String type) {
        this.title = title;
        this.type = type;
        this.status = "Pending"; //dufualt value
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String user) {
        this.assignedTo = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object[] toRow() {
        return new Object[]{title, type, assignedTo, status};
    }
}

class Feature extends Task{
    public Feature(String title){
        super(title, "Feature");
    }
}

class Improvement extends Task{
    public Improvement(String title){
        super(title, "Improvement");
    }
}

class Bug extends Task{
    public Bug(String title){
        super(title, "Bug");
    }
}
