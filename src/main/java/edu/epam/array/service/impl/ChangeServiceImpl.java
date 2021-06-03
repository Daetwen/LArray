package edu.epam.array.service.impl;

import edu.epam.array.entity.CustomArray;
import edu.epam.array.exception.InfoException;
import edu.epam.array.service.ChangeService;
import edu.epam.array.validator.CustomArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChangeServiceImpl implements ChangeService {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int[] changeElementByIndex(CustomArray customArray, int index, int number) throws InfoException {
        if (customArray == null || customArray.length() == 0) {
            logger.error("Invalid CustomArray for work in method changeElementByIndex.");
            throw new InfoException("Invalid CustomArray for work in method changeElementByIndex.");
        }
        int[] array = customArray.getCustomArray();
        if (CustomArrayValidator.isIndexArrayValid(array, index)) {
            array[index] = number;
        } else {
            logger.error("Invalid index: " + index +
                    ". Index must be in range from 0 to " + array.length);
            throw new InfoException("Invalid index: " + index +
                    ". Index must be in range from 0 to " + array.length);
        }
        return array;
    }

    @Override
    public int[] changePostitiveMultiplyByNumber(CustomArray customArray, int number) throws InfoException{
        if (customArray == null || customArray.length() == 0) {
            logger.error("Invalid CustomArray for work in method changePostitiveMultiplyByNumber.");
            throw new InfoException("Invalid CustomArray for work in method changePostitiveMultiplyByNumber.");
        }
        int[] array = customArray.getCustomArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array[i] = array[i] * number;
            }
        }
        return array;
    }

    @Override
    public int[] changeNegativeSubtractTheNumber(CustomArray customArray, int number) throws InfoException{
        if (customArray == null || customArray.length() == 0) {
            logger.error("Invalid CustomArray for work in method changeNegativeSubtractTheNumber.");
            throw new InfoException("Invalid CustomArray for work in method changeNegativeSubtractTheNumber.");
        }
        int[] array = customArray.getCustomArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = array[i] - number;
            }
        }
        return array;
    }
}
