package edu.epam.array.validator;

import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class CustomArrayValidatorTest {

    private final CustomArrayValidator customArrayValidator = new CustomArrayValidator();
    private List<String> testList;
    private int[] testArray;
    private String testString1;
    private String testString2;

    @BeforeClass(groups = { "fileTestGroup" })
    public void setUp() {
        testList = new ArrayList<>();
        testList.add("4 2 3 45 5 6 7 8 9 8");
        testList.add("ewwe");
        testList.add("3 4 5 6 7");

        testArray = new int[] {1, 23, 45, 67, 89, 90};

        testString1 = "1 23 3 4 67 89 111";
        testString2 = "45 67 89 32 11 4r5";
    }

    @Test(groups = { "fileTestGroup" })
    public void isListOfStringArrayValidPositiveTest() {
        boolean actual = customArrayValidator.isListOfStringArrayValid(testList);
        assertTrue(actual);
    }

    @Test(groups = { "fileTestGroup" })
    public void isListOfStringArrayValidNegativeTest1() {
        boolean actual = customArrayValidator.isListOfStringArrayValid(null);
        assertFalse(actual);
    }

    @Test(groups = { "fileTestGroup" })
    public void isListOfStringArrayValidNegativeTest2() {
        List<String> testListLocal = new ArrayList<>();
        boolean actual = customArrayValidator.isListOfStringArrayValid(testListLocal);
        assertFalse(actual);
    }

    @Test(groups = { "fileTestGroup" })
    public void isIndexArrayValidPositiveTest() {
        boolean actual = customArrayValidator.isIndexArrayValid(testArray, 3);
        assertTrue(actual);
    }

    @Test(groups = { "fileTestGroup" })
    public void isIndexArrayValidNegativeTest1() {
        boolean actual = customArrayValidator.isIndexArrayValid(testArray, -2);
        assertFalse(actual);
    }

    @Test(groups = { "fileTestGroup" })
    public void isIndexArrayValidNegativeTest2() {
        boolean actual = customArrayValidator.isIndexArrayValid(testArray, 10);
        assertFalse(actual);
    }

    @Test(groups = { "fileTestGroup" })
    public void checkIsStringArrayValidPositiveTest() {
        boolean actual = customArrayValidator.checkIsStringArrayValid(testString1);
        assertTrue(actual);
    }

    @Test(groups = { "fileTestGroup" })
    public void checkIsStringArrayValidNegativeTest1() {
        boolean actual = customArrayValidator.checkIsStringArrayValid(testString2);
        assertFalse(actual);
    }

    @Test(groups = { "fileTestGroup" })
    public void checkIsStringArrayValidNegativeTest2() {
        boolean actual = customArrayValidator.checkIsStringArrayValid(null);
        assertFalse(actual);
    }

    @Test(groups = { "fileTestGroup" })
    public void checkIsStringArrayValidNegativeTest3() {
        boolean actual = customArrayValidator.checkIsStringArrayValid("");
        assertFalse(actual);
    }
}
