package edu.epam.array.validator;

public class LArrayValidator {
    public boolean checkIsStringArrayValid(String array){
        if (array.isEmpty()) {
            return false;
        }
        System.out.println(array.length());
        for (int i = 1; i < array.length() - 1; i++) {
            if((array.charAt(i) < '0' && array.charAt(i) != ' ') ||
                    (array.charAt(i) > '9' && array.charAt(i) != ' ')) {
                return false;
            }
        }
        return true;
    }
}
