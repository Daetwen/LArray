package edu.epam.array.service;

import edu.epam.array.entity.LArray;

public interface ChangeService {

    int[] changeElementByIndex(LArray lArray, int index, int number);

    int[] changePostitiveMultiplyByNumber(LArray lArray, int number);

    int[] changeNegativeSubtractTheNumber(LArray lArray, int number);

}
