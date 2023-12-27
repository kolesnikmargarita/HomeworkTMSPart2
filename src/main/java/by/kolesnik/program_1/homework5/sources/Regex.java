package by.kolesnik.program_1.homework5.sources;

import java.util.regex.Pattern;

public class Regex {

    public static final Pattern WORD_FROM_UPPERCASE = Pattern.compile("[А-Я][а-я]+");
    public static final Pattern PHONE_NUMBER = Pattern.compile("\\+375\\(\\d{2}\\)\\d{3}(-\\d{2}){2}");
}