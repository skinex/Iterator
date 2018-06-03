package Model;

/**
 * Created by User on 03.06.2018.
 */
public class Account {
    private String login;
    private String password;
    private String email;
    private String phone;

    public Account() {
        this.login = "";
        this.password = "";
        this.email = "";
        this.phone = "";
    }

    public Account(String login, String password, String email, String phone) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    public Account(Account other) {
        this.login = other.login;
        this.password = other.password;
        this.email = other.email;
        this.phone = other.password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Account{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
