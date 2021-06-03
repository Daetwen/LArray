package edu.epam.array.parser;

import edu.epam.array.entity.CustomArray;
import edu.epam.array.exception.InfoException;
import edu.epam.array.validator.CustomArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class CustomArrayParser {

    private static Logger logger = LogManager.getLogger();
    private static String SPLIT_REGEX = "\\s+";

    public CustomArray parseListToCustomArray(List<String> array) throws InfoException {
        CustomArray customArray = new CustomArray();
        if (array != null && !array.isEmpty()) {
            int i = -1;
            while (++i < array.size()) {
                if (CustomArrayValidator.checkIsStringArrayValid(array.get(i))) {
                    int[] numArray = Arrays.stream(array.get(i).split(SPLIT_REGEX))
                            .mapToInt(Integer::parseInt)
                            .toArray();
                    customArray.setCustomArray(numArray);
                    break;
                }
            }
        } else {
            logger.error("Invalid List of string for parsing.");
            throw new InfoException("Invalid List of string for parsing.");
        }
        return customArray;
    }
}
