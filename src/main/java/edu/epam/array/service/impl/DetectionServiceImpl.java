package edu.epam.array.service.impl;

import edu.epam.array.entity.CustomArray;
import edu.epam.array.exception.InfoException;
import edu.epam.array.service.DetectionService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class DetectionServiceImpl implements DetectionService {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public float detectionMeanValue(CustomArray customArray) throws InfoException {
        if (customArray == null || customArray.length() == 0) {
            logger.error("Invalid CustomArray for work in method detectionMeanValue.");
            throw new InfoException("Invalid CustomArray for work in method detectionMeanValue.");
        }
        int[] array = customArray.getCustomArray();
        return detectionSum(customArray) / array.length;
    }

    @Override
    public int detectionSum(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    @Override
    public int detectionPositiveElements(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        int numberOfPositiveElements = 0;
        for (int element : array) {
            if (element > 0) {
                numberOfPositiveElements++;
            }
        }
        return numberOfPositiveElements;
    }

    @Override
    public int detectionNegativeElements(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        int numberOfNegativeElements = 0;
        for (int element : array) {
            if (element < 0) {
                numberOfNegativeElements++;
            }
        }
        return numberOfNegativeElements;
    }

    @Override
    public OptionalDouble detectionMeanValueIntStream(CustomArray customArray) {
        OptionalDouble result = IntStream.of(customArray.getCustomArray()).average();
        return result;
    }

    @Override
    public int detectionSumIntStream(CustomArray customArray) {
        int result = IntStream.of(customArray.getCustomArray()).sum();
        return result;
    }

    @Override
    public long detectionPositiveElementsIntStream(CustomArray customArray) {
        long result = IntStream.of(customArray.getCustomArray()).
                filter(i -> (i > 0)).count();
        return result;
    }

    @Override
    public long detectionNegativeElementsIntStream(CustomArray customArray) {
        long result = IntStream.of(customArray.getCustomArray()).
                filter(i -> i < 0).count();
        return result;
    }

}
