public class User {

    private String username;
    private String password;

    public String getName() {
        return name;
    }

    private String name;

    public User(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
