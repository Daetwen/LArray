package edu.epam.array.entity;

import java.util.Arrays;
import java.util.OptionalInt;

public class LArray {
    private int[] lArray;

    public LArray() {
    }

    public LArray(int... lArray) {
        this.lArray = lArray;
    }

    public int[] getLArray() {
        return Arrays.copyOf(lArray, lArray.length);
    }

    public void setLArray(int[] lArray) {
        this.lArray = lArray;
    }

    public OptionalInt getLArrayElementByIndex(int index) {
        if (index >= 0 && index <= this.lArray.length) {
            return OptionalInt.of(this.lArray[index]);
        }
        return OptionalInt.empty();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int element : this.lArray) {
            stringBuilder.append(element).append(" ");
        }
        return stringBuilder.toString();
    }

    private boolean isEqual(Object object) {
        if(object == null || object.getClass() != this.getClass()) {
            return false;
        }
        LArray array = (LArray) object;
        if (array.length() != this.lArray.length) {
            return false;
        }
        for (int i = 0; i < lArray.length ; i++) {
            if(array.lArray[i] != this.lArray[i]){
                return false;
            }
        }
        return true;
    }

    public int length() {
        return this.lArray.length;
    }
}

