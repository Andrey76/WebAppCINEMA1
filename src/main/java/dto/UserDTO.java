package dto;

import model.User;

import java.time.LocalDate;

/**
 * Created by andr_ on 18.05.2017.
 */
public class UserDTO {
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String sex;
    private LocalDate birthday;
    private User.AccessRight role;

    public UserDTO() {
    }

    public UserDTO(String login, String password, String firstName, String lastName, String email, String sex, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.birthday = birthday;
        this.email = email;
        this.sex = sex;
        this.role = role;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public User.AccessRight getRole() {
        return role;
    }

    public void setRole(User.AccessRight role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", role=" + role +
                "} " + super.toString();
    }
}
