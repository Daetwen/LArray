package edu.epam.array.service;

import edu.epam.array.entity.CustomArray;
import edu.epam.array.exception.InfoException;

import java.util.OptionalDouble;

public interface DetectionService {

    float detectionMeanValue(CustomArray customArray) throws InfoException;

    int detectionSum(CustomArray customArray);

    int detectionPositiveElements(CustomArray customArray);

    int detectionNegativeElements(CustomArray customArray);

    OptionalDouble detectionMeanValueIntStream(CustomArray customArray);

    int detectionSumIntStream(CustomArray customArray);

    long detectionPositiveElementsIntStream(CustomArray customArray);

    long detectionNegativeElementsIntStream(CustomArray customArray);
}
