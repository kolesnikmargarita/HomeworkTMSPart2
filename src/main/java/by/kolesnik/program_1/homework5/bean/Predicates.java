package by.kolesnik.program_1.homework5.bean;

import by.kolesnik.program_1.homework5.sources.Regex;

import java.time.LocalDate;
import java.util.function.Predicate;

public enum Predicates {

    WORD_STARTS_UPPERCASE, BIRTH_DATE, PHONE_NUMBER;

    public Predicate<String> getPredicate() {
        if(this == WORD_STARTS_UPPERCASE) {
            return t -> Regex.WORD_FROM_UPPERCASE.matcher(t.trim()).matches();
        }
        if(this == BIRTH_DATE) {
            return t -> {
                LocalDate date = LocalDate.parse(t);
                return date.isBefore(LocalDate.now().minusYears(18));
            };
        }
        return t -> Regex.PHONE_NUMBER.matcher(t.trim()).matches();
    }
}
