package edu.epam.array.service.impl;

import edu.epam.array.entity.CustomArray;
import edu.epam.array.service.SortService;

import java.util.stream.IntStream;

public class SortServiceImpl implements SortService {

    @Override
    public int[] sortIntStream(CustomArray customArray) {
        int[] array = IntStream.of(customArray.getCustomArray()).sorted().toArray();
        return array;
    }

    @Override
    public int[] sortBubble(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    @Override
    public int[] sortSheker(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            for (int i = 0; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            left++;
        }
        return array;
    }

    @Override
    public int[] sortShell(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        for (int step = array.length / 2; step > 0; step /= 2) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + step; j < array.length; j += step) {
                    if (array[i] > array[j]) {
                        int temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }
            }
        }
        return array;
    }
}
