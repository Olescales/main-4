package lesson4;

public class Queue<T> {

    private LinkedList<T> list = new LinkedList<>();

    public void offerLast (T element) {
        list.offerLast(element);
    }

    public T pollFirst () {
        return list.pollFirst();
    }

    public T peekFirst () {
        return list.peekFirst();
    }

    public boolean isEmpty () {
        return list.size() <= 0;
    }
}
