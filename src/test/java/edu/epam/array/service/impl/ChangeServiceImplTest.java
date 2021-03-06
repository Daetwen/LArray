package edu.epam.array.service.impl;

import edu.epam.array.entity.CustomArray;
import edu.epam.array.exception.InfoException;
import org.testng.annotations.*;

import static org.testng.Assert.*;


public class ChangeServiceImplTest {

    private final ChangeServiceImpl changeServiceImpl = new ChangeServiceImpl();
    private CustomArray customArray;
    private int[] expected;
    private int[] testArray1;
    private int[] testArray2;
    private int[] testArray3;
    private int[] testArray4;
    private int[] testArray5;
    private int[] testArray6;

    @BeforeClass
    public void setUp() {
        customArray = new CustomArray(1, 2, 3, 4, 55, 6, 7, 8, 9);
        expected = new int[0];
        testArray1 = new int[] {1, 2, 3, 23, 45, 56 ,78, 89, 90};
        testArray2 = new int[] {1, 2, 3, 4, 5};
        testArray3 = new int[] {2, 4, 6, 8, 10};
        testArray4 = new int[] {-2, 4, -6, 7, -9};
        testArray5 = new int[] {-4, 4, -8, 7, -11};
        testArray6 = new int[] {-4, 8, -8, 14, -11};
    }

    @Test(description = "Positive test for change element.")
    public void changeElementByIndexPositiveTest() throws InfoException {
        expected = customArray.getCustomArray();
        CustomArray customArrayLocal = new CustomArray(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int[] actual = changeServiceImpl.changeElementByIndex(customArrayLocal, 4, 55);
        assertEquals(actual, expected);
    }

    @Test(description = "Negative test for change element. Select an index outside the array from above.")
    public void changeElementByIndexNegativeTest1() {
        CustomArray customArrayLocal = new CustomArray(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThrows(InfoException.class,
                () -> changeServiceImpl.changeElementByIndex(customArrayLocal, 50, 55));
    }

    @Test(description = "Negative test for change element. Select an index outside the array from below.")
    public void changeElementByIndexNegativeTest2() {
        CustomArray customArrayLocal = new CustomArray(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThrows(InfoException.class,
                () -> changeServiceImpl.changeElementByIndex(customArrayLocal, -2, 55));
    }

    @Test(description = "Positive test for multiply all positive numbers.")
    public void changeMultiplyPositiveTest() throws InfoException {
        expected = testArray3;
        CustomArray customArrayLocal = new CustomArray(testArray2);
        int[] actual = changeServiceImpl.changePostitiveMultiplyByNumber(customArrayLocal, 2);
        assertEquals(actual, expected);
    }

    @Test(description = "Negative test for multiply all positive numbers.")
    public void changeMultiplyNegativeTest() throws InfoException {
        expected = testArray4;
        CustomArray customArrayLocal = new CustomArray(testArray3);
        int[] actual = changeServiceImpl.changePostitiveMultiplyByNumber(customArrayLocal, 2);
        assertNotEquals(actual, expected);
    }

    @Test(description = "Positive test for subtracting a number from all negative numbers.")
    public void changeSubtractPositiveTest() throws InfoException {
        expected = testArray5;
        CustomArray customArrayLocal = new CustomArray(testArray4);
        int[] actual = changeServiceImpl.changeNegativeSubtractTheNumber(customArrayLocal, 2);
        assertEquals(actual, expected);
    }

    @Test(description = "Negative test for subtracting a number from all negative numbers.")
    public void changeSubtractNegativeTest() throws InfoException {
        expected = testArray5;
        CustomArray customArrayLocal = new CustomArray(testArray3);
        int[] actual = changeServiceImpl.changeNegativeSubtractTheNumber(customArrayLocal, 2);
        assertNotEquals(actual, expected);
    }
}
