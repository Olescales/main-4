package lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task2Test {

    @Test
    public void getNumberOfSubsequence() {
        int[] arrayForCheck = new int[]{1, 2, 3, 2, 3, 2};
        int actual = Task2.getNumberOfSubsequence(arrayForCheck,5);
        Assertions.assertEquals(4,actual);
    }
}