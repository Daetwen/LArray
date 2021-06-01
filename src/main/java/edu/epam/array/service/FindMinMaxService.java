package edu.epam.array.service;

import edu.epam.array.entity.CustomArray;
import edu.epam.array.exception.InfoException;

import java.util.OptionalInt;

public interface FindMinMaxService {

    int findMinElement(CustomArray customArray) throws InfoException;

    int findMaxElement(CustomArray customArray) throws InfoException;

    OptionalInt findMinElementIntStream(CustomArray customArray);

    OptionalInt findMaxElementIntStream(CustomArray customArray);
}
