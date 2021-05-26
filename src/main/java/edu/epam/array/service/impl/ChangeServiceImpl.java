package edu.epam.array.service.impl;

import edu.epam.array.entity.LArray;
import edu.epam.array.service.ChangeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChangeServiceImpl implements ChangeService {

    final static Logger logger = LogManager.getLogger();

    @Override
    public int[] changeElementByIndex(LArray lArray, int index, int number) {
        int[] array = lArray.getLArray();
        try {
            array[index] = number;
        } catch (IndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } catch (Exception exceptionAll) {
            exceptionAll.printStackTrace();
        }
        return array;
    }

    @Override
    public int[] changePostitiveMultiplyByNumber(LArray lArray, int number) {
        int[] array = lArray.getLArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array[i] = array[i] * number;
            }
        }
        return array;
    }

    @Override
    public int[] changeNegativeSubtractTheNumber(LArray lArray, int number) {
        int[] array = lArray.getLArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = array[i] - number;
            }
        }
        return array;
    }
}
