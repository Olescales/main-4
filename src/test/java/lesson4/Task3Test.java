package lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task3Test {

    @Test
    public void getArray() {
        int[] a = new int[]{5, 2, 1, 10, -1, 1, 2, 3, 5};
        int[] b = new int[]{1, 2, 3, 4, 5};

        int[] actual = Task3.getArray(a, b);

        Assertions.assertArrayEquals(new int[]{2, 1, 7, -1, 0}, actual);
    }
}