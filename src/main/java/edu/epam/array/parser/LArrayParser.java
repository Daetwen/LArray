package edu.epam.array.parser;

import edu.epam.array.entity.LArray;
import edu.epam.array.validator.LArrayValidator;

import java.util.Arrays;
import java.util.List;

public class LArrayParser {

    private static LArrayValidator lArrayValidator = new LArrayValidator();
    public LArray parseListToLArray(List<String> array) {
        LArray lArray = new LArray();
        int i = 0;
        while (i < array.size()) {
            if (lArrayValidator.checkIsStringArrayValid(array.get(i))) {
                int[] numArray = Arrays.stream(array.get(i).split(" ")).mapToInt(Integer::parseInt).toArray();
                lArray.setLArray(numArray);
                break;
            }
            i++;
        }
        return lArray;
    }
}
