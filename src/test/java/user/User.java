package user;

public class User {

    private String name;
    private String login;
    private String password;

    public User(String name, String phone, String password) {
        this.name = name;
        this.login = phone;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}

