package by.kolesnik.program_1.homework5.bean;

//import by.kolesnik.program_1.homework5.exceptions.IncorrectInputException;

import java.time.LocalDate;

public class UserBuilder {

    private final User user;
    private boolean userStatus = true;

    public UserBuilder() {
        user = new User();
    }

    public UserBuilder username(String username) {
        user.setUsername(username);
        return this;
    }
    public UserBuilder password(String password) {
        user.setPassword(password);
        return this;
    }
    public UserBuilder firstname(String firstname) {
        if(!Predicates.WORD_STARTS_UPPERCASE.getPredicate().test(firstname)) {
            firstname = null;
            userStatus = false;
            //throw new IncorrectInputException("Некоррректное имя");
        }
        user.setFirstname(firstname);
        return this;
    }
    public UserBuilder lastname(String lastname) {
        if(!Predicates.WORD_STARTS_UPPERCASE.getPredicate().test(lastname)) {
            lastname = null;
            userStatus = false;
            //throw new IncorrectInputException("Некоррректная фамилия");
        }
        user.setLastname(lastname);
        return this;
    }
    public UserBuilder patronymic(String patronymic) {
        if(!Predicates.WORD_STARTS_UPPERCASE.getPredicate().test(patronymic)) {
            patronymic = null;
            userStatus = false;
            //throw new IncorrectInputException("Некоррректное отчество");
        }
        user.setPatronymic(patronymic);
        return this;
    }

    public UserBuilder gender(String gender) {
        user.setGender(gender);
        return this;
    }
    public UserBuilder birthDat(String birthdate) {
        if(!Predicates.BIRTH_DATE.getPredicate().test(birthdate)) {
            user.setBirthDate(null);
            userStatus = false;
            //throw new IncorrectInputException("Некоррректная дата");
        } else {
            user.setBirthDate(LocalDate.parse(birthdate));
        }
        return this;
    }
    public UserBuilder city(String city) {
        if(!Predicates.WORD_STARTS_UPPERCASE.getPredicate().test(city)) {
            city = null;
            userStatus = false;
            //throw new IncorrectInputException("Некоррректный город");
        }
        user.setCity(city);
        return this;
    }
    public UserBuilder phoneNumber(String phoneNumber) {
        if(!Predicates.PHONE_NUMBER.getPredicate().test(phoneNumber)) {
            phoneNumber = null;
            userStatus = false;
            //throw new IncorrectInputException("Некоррректный номер телефона");
        }
        user.setPhoneNumber(phoneNumber);
        return this;
    }

    public User build() {
        user.setStatus(userStatus);
        return user;
    }
}
