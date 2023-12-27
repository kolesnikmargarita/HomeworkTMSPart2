package by.kolesnik.program_1.homework1.task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Names {

    Set<String> names = new HashSet<>();

    public Names(String ... setNames) {
        names.addAll(Arrays.asList(setNames));
    }

    public boolean addName(String name) {
        return names.add(name);
    }

    public boolean removeName(String name) {
        return names.remove(name);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(String name : names) {
            result.append(name).append(", ");
        }
        if(result.toString().endsWith(", ")) {
            result.delete(result.length() - 2, result.length());
        }
        return result.toString();
    }
}
