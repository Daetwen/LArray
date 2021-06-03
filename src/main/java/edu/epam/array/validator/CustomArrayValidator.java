package edu.epam.array.validator;

import java.util.List;

public class CustomArrayValidator {

    public static boolean isListOfStringArrayValid(List<String> array) {
        return array != null && !array.isEmpty();
    }

    public static boolean isIndexArrayValid(int[] array, int index) {
        return (array != null && index >= 0 && index <= array.length);
    }

    public static boolean checkIsStringArrayValid(String array){
        if (array == null || array.isEmpty()) {
            return false;
        }
        for (int i = 0; i < array.length() - 1; i++) {
            if((array.charAt(i) < '0' && array.charAt(i) != ' ' && array.charAt(i) != '-') ||
                    (array.charAt(i) > '9' && array.charAt(i) != ' ' && array.charAt(i) != '-')) {
                return false;
            }
        }
        return true;
    }
}
