package lesson2;

public class Vector<T> {

    private T[] dynamicArray;
    private int realArraySize;

    public Vector() {
        dynamicArray = (T[]) new Object[5];
    }

    //CPU O(1)
    //RAM O(1)
    public void add (T t) {
        if (realArraySize == dynamicArray.length) {
            T[] replacementArray = (T[]) new Object[dynamicArray.length * 2];
            System.arraycopy(dynamicArray,0,replacementArray,0, realArraySize);
            dynamicArray = replacementArray;
        }
        dynamicArray[realArraySize++] = t;
    }

    //CPU O(1)
    //RAM O(1)
    public int size() {
        return realArraySize;
    }

    //CPU O(1)
    //RAM O(1)
    public T get(int elementIndex) {
        return dynamicArray[elementIndex];
    }

    //CPU O(1)
    //RAM O(1)
    public void set (T t, int index) {
        if (index >= 0 && index < realArraySize) {
            dynamicArray[index] = t;
        }
    }

    //CPU O(n)
    //RAM O(1)
    public void remove (int index) {
        if (index >= 0 && index < realArraySize) {
            realArraySize--;
            System.arraycopy(dynamicArray, index + 1, dynamicArray, index, realArraySize - index);
        }
    }

    //CPU O(n)
    //RAM O(n)
    public void add (T t, int index) {
        if (index >= 0 && index < realArraySize ) {
            T[] tempArray = (T[])new Object[realArraySize + 1];
            System.arraycopy(dynamicArray,0,tempArray,0, index);
            tempArray[index] = t;
            System.arraycopy(dynamicArray,index ,tempArray,index + 1, realArraySize - index);
            realArraySize++;
            dynamicArray = tempArray;
        }
    }

    //n = realArraySize
    //CPU O(n)
    //RAM O(n)
    public Object[] toArray() {
        Object[] result = new Object[realArraySize];
        if (realArraySize >= 0) {
            System.arraycopy(dynamicArray,0,result,0, realArraySize);
        }
        return result;
    }

    //CPU O(n * n)
    //RAM O(1)
    public void sort (Comparator<T> comparator) {
        for (int i = realArraySize - 1; i >= 0; i--) {
            for (int j = 1; j < realArraySize; j++) {
                if (comparator.compare(dynamicArray[j-1], dynamicArray[j]) >= 0) {
                    T t = dynamicArray[j];
                    dynamicArray[j] = dynamicArray[j-1];
                    dynamicArray[j-1] = t;
                }
            }
        }
    }

    //CPU O(n)
    //RAM O(1)
    public void clear () {
        for (int i = 0; i < realArraySize; i++) {
            dynamicArray[i] = null;
        }
        realArraySize = 0;
    }
}
