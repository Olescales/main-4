package lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Tests {
    @Test
    public void sum_positiveValues_calculated() {
        Assertions.assertEquals(15, Task1.sum(5, 10));
    }

    @Test
    public void sum_negativeValues_calculated() {
        Assertions.assertEquals(-10, Task1.sum(-7, -3));
    }

    @Test
    public void mergeSortedArrayPosNumbers() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 1, 1, 1, 1};
        int[] actual = Task1.mergeSortedArrays(a, b);
        int[] expected = {1,1,1,1,1,1,2,3,4,5};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void mergeSortedArrayOneEmptyArray() {
        int[] a = {};
        int[] b = {1, 1, 1, 1, 1};
        int[] actual = Task1.mergeSortedArrays(a, b);
        int[] expected = {1,1,1,1,1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void mergeSortArrayPosAndNegNumbers() {
        int[] a = {-5,-4,-3,-2,-1};
        int[] b = {-6, 1, 2, 3, 100};
        int[] actual = Task1.mergeSortedArrays(a, b);
        int[] expected = {-6,-5,-4,-3,-2,-1,1,2,3,100};
        Assertions.assertArrayEquals(expected, actual);
    }
}
