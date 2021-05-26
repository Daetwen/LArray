package edu.epam.array.service.impl;

import edu.epam.array.entity.LArray;
import edu.epam.array.service.DetectionService;

public class DetectionServiceImpl implements DetectionService {

    @Override
    public float detectionMeanValue(LArray lArray) {
        int[] array = lArray.getLArray();
        return detectionSum(lArray) / array.length;
    }

    @Override
    public int detectionSum(LArray lArray) {
        int[] array = lArray.getLArray();
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    @Override
    public int detectionPositiveElements(LArray lArray) {
        int[] array = lArray.getLArray();
        int numberOfPositiveElements = 0;
        for (int element : array) {
            if (element > 0) {
                numberOfPositiveElements++;
            }
        }
        return numberOfPositiveElements;
    }

    @Override
    public int detectionNegativeElements(LArray lArray) {
        int[] array = lArray.getLArray();
        int numberOfNegativeElements = 0;
        for (int element : array) {
            if (element < 0) {
                numberOfNegativeElements++;
            }
        }
        return numberOfNegativeElements;
    }

}
