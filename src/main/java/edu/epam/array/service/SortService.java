package edu.epam.array.service;

import edu.epam.array.entity.CustomArray;

public interface SortService {

    int[] sortIntStream(CustomArray customArray);

    int[] sortBubble(CustomArray customArray);

    int[] sortSheker(CustomArray customArray);

    int[] sortShell(CustomArray customArray);
}
