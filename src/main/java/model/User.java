package model;

import java.time.LocalDate;

/**
 * Created by andr_ on 18.05.2017.
 */
public class User extends Entity<Integer> {
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private LocalDate birthday;
    private String email;
    private String sex;
   // private Role role;
    private AccessRight role;

    public User() {
    }

    public User(
            String login
            ,String password
            ,String firstName
            ,String lastName
            ,String email
            ,String sex,
            LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.birthday = birthday;
        this.email = email;
        this.sex = sex;
        this.role = AccessRight.User;
    }
    public enum AccessRight {
        Admin(0), User(1);

        private int num;

        AccessRight(int num) {
            this.num = num;
        }

        public int getRoleCode() {
            return num;
        }

    }
    public AccessRight getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = AccessRight.values()[role];
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

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                ", role=" + role +
                '}';
    }
}

