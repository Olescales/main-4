package lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListTest {

    private LinkedList<Integer> getTestData() {
        LinkedList<Integer> testList = new LinkedList<>();
        testList.offerFirst(1);
        testList.offerFirst(2);
        testList.offerFirst(3);
        testList.offerFirst(4);
        testList.offerFirst(5);
        return testList;
    }

    @Test
    void offerLast() {
        LinkedList<Integer> list = getTestData();
        list.offerLast(6);
        Assertions.assertArrayEquals(new Integer[]{5, 4, 3, 2, 1, 6}, list.toArray());
    }

    @Test
    void pollLast() {
        LinkedList<Integer> list = getTestData();
        list.pollLast();
        Assertions.assertArrayEquals(new Integer[]{5, 4, 3, 2}, list.toArray());
    }

    @Test
    void pollLastReturnValue() {
        LinkedList<Integer> list = getTestData();
        int actual = list.pollLast();
        Assertions.assertEquals(1, actual);
    }

    @Test
    void peekLast() {
        LinkedList<Integer> list = getTestData();
        int actual = list.peekLast();
        Assertions.assertEquals(1, actual);
    }

    @Test
    void offerFirst() {
        LinkedList<Integer> list = getTestData();
        list.offerFirst(6);
        Assertions.assertArrayEquals(new Integer[]{6, 5, 4, 3, 2, 1}, list.toArray());
    }

    @Test
    void pollFirst() {
        LinkedList<Integer> list = getTestData();
        list.pollFirst();
        Assertions.assertArrayEquals(new Integer[]{4, 3, 2, 1}, list.toArray());
    }

    @Test
    void pollFirstReturn() {
        LinkedList<Integer> list = getTestData();
        int actual = list.pollFirst();
        Assertions.assertEquals(5, actual);
    }

    @Test
    void peekFirst() {
        LinkedList<Integer> list = getTestData();
        int actual = list.peekFirst();
        Assertions.assertEquals(5, actual);
    }

    @Test
    void size() {
        LinkedList<Integer> list = getTestData();
        Assertions.assertEquals(5, list.size());
    }

    @Test
    void get() {
        LinkedList<Integer> list = getTestData();
        int actual = list.get(3);
        Assertions.assertEquals(2, actual);
    }

    @Test
    void getZeroPosition() {
        LinkedList<Integer> list = getTestData();
        int actual = list.get(0);
        Assertions.assertEquals(5, actual);
    }

    @Test
    void add() {
        LinkedList<Integer> list = getTestData();
        list.add(10, 3);
        Assertions.assertArrayEquals(new Integer[]{5, 4, 3, 10, 2, 1}, list.toArray());
    }

    @Test
    void addOnFirstPosition() {
        LinkedList<Integer> list = getTestData();
        list.add(10, 0);
        Assertions.assertArrayEquals(new Integer[]{10, 5, 4, 3, 2, 1}, list.toArray());
    }

    @Test
    void addLastPosition() {
        LinkedList<Integer> list = getTestData();
        list.add(10, 5);
        Assertions.assertArrayEquals(new Integer[]{5, 4, 3, 2, 1, 10}, list.toArray());
    }
    @Test
    void remove() {
        LinkedList<Integer> list = getTestData();
        list.remove(2);
        Assertions.assertArrayEquals(new Integer[]{5, 4, 2, 1}, list.toArray());
    }
}