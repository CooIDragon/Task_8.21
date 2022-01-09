package ru.vsu.cs.baturin_v_a;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.baturin_v_a.util.ArrayUtils;

public class CreatingSquareArrayTest {
    CreatingSquareArray creatingSquareArray = new CreatingSquareArray();

    @Test
    public void testDeletingColumns() {
        int[][] array2 = ArrayUtils.readIntArray2FromFile("testSrc/testInput1.txt");

        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("testSrc/testOutput1.txt");
        int[][] factualResult = creatingSquareArray.createSquareArray(array2);

        Assert.assertArrayEquals(expectedResult, factualResult);
    }

    @Test
    public void testCreatingAnotherSquareArrayFromGiven() {
        int[][] array2 = ArrayUtils.readIntArray2FromFile("testSrc/testInput2.txt");

        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("testSrc/testOutput2.txt");
        int[][] factualResult = creatingSquareArray.createSquareArray(array2);

        Assert.assertArrayEquals(expectedResult, factualResult);
    }

    @Test
    public void testDeletingRows() {
        int[][] array2 = ArrayUtils.readIntArray2FromFile("testSrc/testInput3.txt");

        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("testSrc/testOutput3.txt");
        int[][] factualResult = creatingSquareArray.createSquareArray(array2);

        Assert.assertArrayEquals(expectedResult, factualResult);
    }

    @Test
    public void testReactionToZeroNumbers() {
        int[][] array2 = ArrayUtils.readIntArray2FromFile("testSrc/testInput4.txt");

        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("testSrc/testOutput4.txt");
        int[][] factualResult = creatingSquareArray.createSquareArray(array2);

        Assert.assertArrayEquals(expectedResult, factualResult);
    }

    @Test
    public void testReactionToBigNumbers() {
        int[][] array2 = ArrayUtils.readIntArray2FromFile("testSrc/testInput5.txt");

        int[][] expectedResult = ArrayUtils.readIntArray2FromFile("testSrc/testOutput5.txt");
        int[][] factualResult = creatingSquareArray.createSquareArray(array2);

        Assert.assertArrayEquals(expectedResult, factualResult);
    }
}