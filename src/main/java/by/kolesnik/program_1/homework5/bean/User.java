package by.kolesnik.program_1.homework5.bean;

import java.time.LocalDate;

public class User {

    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String patronymic;
    private String gender;
    private LocalDate birthDate;
    private String city;
    private String phoneNumber;
    private boolean status;

    public static Boolean haseObject = false;

    User() {
        haseObject = true;
    }

    void setUsername(String username) {
        this.username = username;
    }

    void setPassword(String password) {
        this.password = password;
    }

    void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    void setLastname(String lastname) {
        this.lastname = lastname;
    }

    void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    void setGender(String gender) {
        this.gender = gender;
    }

    void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    void setCity(String city) {
        this.city = city;
    }

    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    void setStatus(boolean status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }
    public String getGender() {return gender;}

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getCity() {
        return city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean getStatus() {
        return status;
    }

}
