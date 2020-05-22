package lesson4;

import lesson2.Vector;

public class Task3 {

    //n - a.length
    //m - b.length
    //CPU O(m * log n + n * log m)
    //RAM O(n + m)
    public static int[] getArray(int[] a, int[] b) {
        int[] arrayForReturn = new int[b.length];
        Vector<Integer> vectorForArrayA = new Vector<>();
        Vector<Integer> vectorForArrayB = new Vector<>();

        for (int i = 0; i < a.length; i++) {
            vectorForArrayA.add(a[i]);
        }
        vectorForArrayA.sort((num1, num2) -> num1 - num2);
        for (int i = 0; i < b.length; i++) {
            int result = binarySearch(vectorForArrayA, b[i]);
            if (result == -1) {
                arrayForReturn[i] = result;
            }
        }

        for (int i = 0; i < b.length; i++) {
            vectorForArrayB.add(b[i]);
        }
        for (int i = 1; i < a.length; i++) {
            int numberPosition = binarySearch(vectorForArrayB, a[i]);
            if (numberPosition != -1 && arrayForReturn[numberPosition] == 0) {
                arrayForReturn[numberPosition] = i;
            }
        }
        int numberPosition = binarySearch(vectorForArrayB, a[0]);
        if (numberPosition != -1) {
            arrayForReturn[numberPosition] = 0;
        }

        return arrayForReturn;
    }

    private static int binarySearch(Vector<Integer> sortedArray, int number) {
        int left = 0;
        int right = sortedArray.size();
        int mid = left + (right - left) / 2;

        while (left < right) {
            if (number == sortedArray.get(mid)) {
                return mid;
            } else if (number > sortedArray.get(mid)) {
                left = mid + 1;
                mid = left + (right - left) / 2;
            } else {
                right = mid;
                mid = left + (right - left) / 2;
            }
        }
        return -1;
    }
}
