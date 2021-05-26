package edu.epam.array.service;

import edu.epam.array.entity.LArray;

public interface SortService {

    int[] sortBubble(LArray lArray);

    int[] sortSheker(LArray lArray);

    int[] sortShell(LArray lArray);

}
