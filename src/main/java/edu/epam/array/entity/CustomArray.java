package edu.epam.array.entity;

import edu.epam.array.validator.CustomArrayValidator;

import java.util.Arrays;
import java.util.OptionalInt;

public class CustomArray {
    private int[] customArray;

    public CustomArray() {
        this.customArray = new int[0];
    }

    public CustomArray(int... customArray) {
        this.customArray = customArray;
    }

    public int[] getCustomArray() {
        return Arrays.copyOf(this.customArray, this.customArray.length);
    }

    public void setCustomArray(int[] lArray) {
        this.customArray = lArray;
    }

    public OptionalInt getCustomArrayElementByIndex(int index) {
        if (CustomArrayValidator.isIndexArrayValid(this.customArray, index)) {
            return OptionalInt.of(this.customArray[index]);
        }
        return OptionalInt.empty();
    }

    public boolean isEqual(Object object) {
        if(object == null || object.getClass() != this.getClass()) {
            return false;
        }
        CustomArray array = (CustomArray) object;
        if (array.length() != this.customArray.length) {
            return false;
        }
        for (int i = 0; i < customArray.length ; i++) {
            if(array.customArray[i] != this.customArray[i]){
                return false;
            }
        }
        return true;
    }

    public int length() {
        return this.customArray.length;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.customArray);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int element : this.customArray) {
            stringBuilder.append(element).append(" ");
        }
        return stringBuilder.toString();
    }
}

