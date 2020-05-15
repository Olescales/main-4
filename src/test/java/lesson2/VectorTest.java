package lesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    private Vector<Integer> getVectorWithData () {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        return vector;
    }

    @Test
    void add() {
        Vector<Integer> vector = getVectorWithData();
        vector.add(4);
        Assertions.assertArrayEquals(new Integer[]{1,2,3,4},vector.toArray());
    }

    @Test
    void size() {
        Vector<Integer> vector = getVectorWithData();
        Assertions.assertEquals(3,vector.size());
    }

    @Test
    void get() {
        Vector<Integer> vector = getVectorWithData();
        Assertions.assertEquals(1,vector.get(0));
    }

    @Test
    void addWithIndex() {
        Vector<Integer> vector = getVectorWithData();
        vector.add(5,1);
        Assertions.assertArrayEquals(new Integer[]{1,5,2,3},vector.toArray());
    }

    @Test
    void toArray() {
        Vector<Integer> vector = getVectorWithData();
        Assertions.assertArrayEquals(new Integer[]{1,2,3}, vector.toArray());
    }

    @Test
    void remove() {
        Vector<Integer> vector = getVectorWithData();
        vector.remove(1);
        Assertions.assertArrayEquals(new Integer[]{1,3},vector.toArray());
    }

    @Test
    void sortDescending() {
        Vector<Integer> vector = getVectorWithData();
        vector.sort((o1,o2) -> o1 - o2);
        Assertions.assertArrayEquals(new Integer[]{3,2,1},vector.toArray());
    }

    @Test
    void sortAscending() {
        Vector<Integer> vector = new Vector<>();
        vector.add(6);
        vector.add(3);
        vector.add(22);
        vector.add(0);
        vector.add(5);

        vector.sort((o1,o2) -> o2 - o1);
        Assertions.assertArrayEquals(new Integer[]{0,3,5,6,22},vector.toArray());
    }

    @Test
    void clear() {
        Vector<Integer> vector = getVectorWithData();
        vector.clear();
        Assertions.assertEquals(0,vector.size());
    }
}