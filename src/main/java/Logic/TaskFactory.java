package Logic;

public class TaskFactory {
    public static Task createTask(String type, String title){
        switch (type.toLowerCase()) {
            case "bug":
                return new Bug(title);
            case "feature":
                return new Feature(title);
            case "improvement":
                return new Improvement(title);
            default:
                throw new AssertionError();
        }
    }
}
