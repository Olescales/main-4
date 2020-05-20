package lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Test {

    @Test
    public void getRecursionDepthFour() {
        int[][] vertexes = new int[][]{{1, 2}, {1, 3}, {2, 4}, {3, 5}, {3, 6}, {5, 7}};
        int actualResult = Task1.getHeight(vertexes);
        Assertions.assertEquals(4, actualResult);
    }

    @Test
    public void getRecursionDepthSix() {
        int[][] vertexes = new int[][]{{1, 2}, {1, 3}, {2, 4}, {3, 5}, {3, 6}, {5, 7}, {7, 8}, {8, 9}};
        int actualResult = Task1.getHeight(vertexes);
        Assertions.assertEquals(6, actualResult);
    }

    @Test
    public void getRecursionDepthTwo() {
        int[][] vertexes = new int[][]{{1, 2}, {1, 3}, {1, 4}, {1, 5}, {1, 6}, {1, 7}, {1, 8}};
        int actualResult = Task1.getHeight(vertexes);
        Assertions.assertEquals(2, actualResult);
    }
}