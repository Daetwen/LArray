package edu.epam.array.service;

import edu.epam.array.entity.CustomArray;
import edu.epam.array.exception.InfoException;

public interface ChangeService {

    int[] changeElementByIndex(CustomArray customArray, int index, int number) throws InfoException;

    int[] changePostitiveMultiplyByNumber(CustomArray customArray, int number) throws InfoException;

    int[] changeNegativeSubtractTheNumber(CustomArray customArray, int number) throws InfoException;
}
