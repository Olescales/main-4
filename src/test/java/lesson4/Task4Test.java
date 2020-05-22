package lesson4;

import lesson2.Vector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4Test {

    @Test
    public void getLinks() {
        int[][] linksArray = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}};
        Vector<Integer> actual = Task4.getLinks(5, linksArray, 1, 5);
        Assertions.assertArrayEquals(new Integer[0], actual.toArray());
    }

    @Test
    public void getLinksSecondVariant() {
        int[][] linksArray = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}};
        Vector<Integer> actual = Task4.getLinks(5, linksArray, 4, 1);
        Assertions.assertArrayEquals(new Integer[]{4, 1}, actual.toArray());
    }
}