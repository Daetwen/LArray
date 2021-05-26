package edu.epam.array.service.impl;

import edu.epam.array.entity.LArray;
import edu.epam.array.service.FindMinMaxService;

public class FindMinMaxServiceImpl implements FindMinMaxService {

    @Override
    public int findMinElement(LArray lArray) {
        int[] array = lArray.getLArray();
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }

    @Override
    public int findMaxElement(LArray lArray) {
        int[] array = lArray.getLArray();
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        return result;
    }

}
