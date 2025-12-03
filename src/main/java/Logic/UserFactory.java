package Logic;

public class UserFactory {

    public static User createUser(String name, String role) {
        return new User(name, role);
    }
}
