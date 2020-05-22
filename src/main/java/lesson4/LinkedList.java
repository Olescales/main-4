package lesson4;

public class LinkedList<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size;

    //CPU O(1)
    //RAM O(1)
    public void offerLast(T element) {
        Node<T> nodeForAdd = new Node<>(null, lastNode, element);
        if (lastNode == null) {
            firstNode = nodeForAdd;
        } else {
            lastNode.nextNode = nodeForAdd;
        }
        lastNode = nodeForAdd;
        size++;
    }

    //CPU O(1)
    //RAM O(1)
    public T pollLast() {
        T element = lastNode.value;
        if (size == 0) {

        } else if (size == 1) {
            firstNode = null;
            lastNode = null;
            size--;
        } else {
            Node<T> secondLastNode = lastNode.prevNode;
            lastNode = secondLastNode;
            secondLastNode.nextNode = null;
            size--;
        }
        return element;
    }

    //CPU O(1)
    //RAM O(1)
    public T peekLast() {
        if (size >= 1) {
            return lastNode.value;
        }
        return null;
    }

    //CPU O(1)
    //RAM O(1)
    public void offerFirst(T element) {
        Node<T> nodeToAdd = null;
        if (size == 0) {
            nodeToAdd = new Node<>(element);
            firstNode = nodeToAdd;
            lastNode = nodeToAdd;
        } else {
            nodeToAdd = new Node<>(firstNode, null, element);
            firstNode.prevNode = nodeToAdd;
            firstNode = nodeToAdd;
        }
        size++;
    }

    //CPU O(1)
    //RAM O(1)
    public T pollFirst() {
        T element = firstNode.value;
        if (size == 0) {

        }
        if (size == 1) {
            firstNode = null;
            lastNode = null;
            size--;
        } else if (size > 1) {
            firstNode = firstNode.nextNode;
            firstNode.prevNode = null;
            size--;
        }
        return element;
    }

    //CPU O(1)
    //RAM O(1)
    public T peekFirst() {
        if (size >= 1) {
            return firstNode.value;
        }
        return null;
    }

    //CPU O(1)
    //RAM O(1)
    public int size() {
        return size;
    }

    //CPU O(n)
    //RAM O(1)
    public T get(int index) {
        if (index == 0) {
            peekFirst();
        } else if (index == size - 1) {
            peekLast();
        }
        if (index < size - 1) {
            Node<T> desiredNode = getNode(index);
            return desiredNode.value;
        }
        return null;
    }

    //CPU O(n)
    //RAM O(1)
    public void add(T element, int index) {
        Node<T> nodeForAdd = new Node<>(element);
        if (index == 0 ) {
            offerFirst(element);
        } else if (index == size ) {
            offerLast(element);
        } else if (index < size ) {
            int counter = 0;
            Node<T> nodeBeforeBeingAdded = null;
            Node<T> nodeAfterBeingAdded = firstNode;
            while (counter != index) {
                nodeBeforeBeingAdded = nodeAfterBeingAdded;
                nodeAfterBeingAdded = nodeAfterBeingAdded.nextNode;
                counter++;
            }
            nodeBeforeBeingAdded.nextNode = nodeForAdd;
            nodeForAdd.prevNode = nodeBeforeBeingAdded;
            nodeAfterBeingAdded.prevNode = nodeForAdd;
            nodeForAdd.nextNode = nodeAfterBeingAdded;
            size++;
        }
    }

    //CPU O(n)
    //RAM O(1)
    public void remove(int index) {
        if (index == 0 ) {
            pollFirst();
        } else if (index == size - 1) {
            pollLast();
        } else if (index < size - 1) {
            Node<T> nodeForRemove = getNode(index);
            Node<T> prevBeingDeleted = nodeForRemove.prevNode;
            Node<T> nextBeingDeleted = nodeForRemove.nextNode;
            prevBeingDeleted.nextNode = nextBeingDeleted;
            nextBeingDeleted.prevNode = prevBeingDeleted;
            size--;
        }
    }

    public T[] toArray() {
        T[] elements = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            elements[i] = getNode(i).value;
        }
        return elements;
    }

    private Node<T> getNode (int index) {
        int counter = 0;
        Node<T> nodeForIteration = firstNode;
        Node<T> desiredNode = firstNode;
        while (counter != index) {
            desiredNode = nodeForIteration.nextNode;
            nodeForIteration = desiredNode;
            counter++;
        }
        return desiredNode;
    }

    private static class Node<T> {
        private Node<T> nextNode;
        private Node<T> prevNode;
        private T value;

        public Node(Node<T> nextNode, Node<T> prevNode, T value) {
            this.nextNode = nextNode;
            this.prevNode = prevNode;
            this.value = value;
        }

        public Node(T value) {
            this.value = value;
        }
    }
}
