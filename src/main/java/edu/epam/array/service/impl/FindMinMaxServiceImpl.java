package edu.epam.array.service.impl;

import edu.epam.array.entity.CustomArray;
import edu.epam.array.exception.InfoException;
import edu.epam.array.service.FindMinMaxService;
import edu.epam.array.validator.CustomArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindMinMaxServiceImpl implements FindMinMaxService {

    private static Logger logger = LogManager.getLogger();

    @Override
    public int findMinElement(CustomArray customArray) throws InfoException {
        if (!CustomArrayValidator.isCustomArrayValid(customArray)) {
            logger.error("Invalid CustomArray for work in method findMinElement.");
            throw new InfoException("Invalid CustomArray for work in method findMinElement.");
        }
        int[] array = customArray.getCustomArray();
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }

    @Override
    public int findMaxElement(CustomArray customArray) throws InfoException {
        if (!CustomArrayValidator.isCustomArrayValid(customArray)) {
            logger.error("Invalid CustomArray for work in method findMaxElement.");
            throw new InfoException("Invalid CustomArray for work in method findMaxElement.");
        }
        int[] array = customArray.getCustomArray();
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        return result;
    }

    @Override
    public OptionalInt findMinElementIntStream(CustomArray customArray) {
        OptionalInt result = IntStream.of(customArray.getCustomArray()).min();
        return result;
    }

    @Override
    public OptionalInt findMaxElementIntStream(CustomArray customArray) {
        OptionalInt result = IntStream.of(customArray.getCustomArray()).max();
        return result;
    }
}
