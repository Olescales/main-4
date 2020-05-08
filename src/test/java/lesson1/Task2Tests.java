package lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2Tests {

    @Test
    public void sortPosNumbersArray () {
        int[][] multiDimArray = {
                {1,2,3,3},
                {4,5,6,2},
                {7,1,1,1}};
        int[][] expected = {
                {4,5,6,2},
                {7,1,1,1},
                {1,2,3,3}};
        int[][] actual = Task2.sortStrings(multiDimArray);
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void sortPosAndNegNumbersArray () {
        int[][] multiDimArray = {
                {1,2,-3,3},
                {4,-5,-6,2},
                {-7,1,1,1}};
        int[][] expected = {
                {1,2,-3,3},
                {-7,1,1,1},
                {4,-5,-6,2},
        };
        int[][] actual = Task2.sortStrings(multiDimArray);
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void sortOneArray () {
        int[][] multiDimArray = {
                {1,2,-3,3},
                };
        int[][] expected = {
                {1,2,-3,3},
                };
        int[][] actual = Task2.sortStrings(multiDimArray);
        Assertions.assertArrayEquals(expected,actual);
    }
}
