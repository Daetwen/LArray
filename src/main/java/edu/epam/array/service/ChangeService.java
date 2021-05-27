package edu.epam.array.service;

import edu.epam.array.entity.LArray;
import edu.epam.array.exception.InfoException;

public interface ChangeService {

    int[] changeElementByIndex(LArray lArray, int index, int number) throws InfoException;

    int[] changePostitiveMultiplyByNumber(LArray lArray, int number);

    int[] changeNegativeSubtractTheNumber(LArray lArray, int number);

}
