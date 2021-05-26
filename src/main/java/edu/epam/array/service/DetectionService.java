package edu.epam.array.service;

import edu.epam.array.entity.LArray;

public interface DetectionService {

    float detectionMeanValue(LArray larray);

    int detectionSum(LArray larray);

    int detectionPositiveElements(LArray larray);

    int detectionNegativeElements(LArray larray);
}
