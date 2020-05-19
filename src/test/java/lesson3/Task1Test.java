package lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Test {

    @Test
    public void getHeight() {
        int numberOfVertexes = 7;
        int[][] vertexes = new int[][]{{1, 2}, {1, 3}, {2, 4}, {3, 5}, {3, 6}, {5, 7}};
        int actualResult = Task1.getHeight(numberOfVertexes, vertexes);
        Assertions.assertEquals(4, actualResult);
    }
}