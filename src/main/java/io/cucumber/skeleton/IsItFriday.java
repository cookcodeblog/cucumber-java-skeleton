package io.cucumber.skeleton;

public class IsItFriday {
    public static String isItFriday(String today) {
        if("Friday".equalsIgnoreCase(today)) {
            return "Yes";
        } else {
            return "Nope";
        }
    }
}
