package edu.epam.array.service.impl;

import edu.epam.array.entity.LArray;
import edu.epam.array.exception.InfoException;
import edu.epam.array.service.ChangeService;
import edu.epam.array.validator.LArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChangeServiceImpl implements ChangeService {
    private final static Logger logger = LogManager.getLogger();

    @Override
    public int[] changeElementByIndex(LArray lArray, int index, int number) throws InfoException {
        int[] array = lArray.getLArray();
        if (LArrayValidator.isIndexArrayValid(array, index)) {
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
    public int[] changePostitiveMultiplyByNumber(LArray lArray, int number) {
        int[] array = lArray.getLArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array[i] = array[i] * number;
            }
        }
        return array;
    }

    @Override
    public int[] changeNegativeSubtractTheNumber(LArray lArray, int number) {
        int[] array = lArray.getLArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = array[i] - number;
            }
        }
        return array;
    }
}
