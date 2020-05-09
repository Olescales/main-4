package lesson1;

public class Task1 {

    //CPU: O(n + m)
    //RAM: O(1)
    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];

        for (int i = 0, j = 0, k = 0; i < c.length; i++) {

            if (j < a.length && k < b.length) {
                if (a[j] <= b[k]) {
                    c[i] = a[j++];
                } else if (a[j] > b[k]) {
                    c[i] = b[k++];
                }
            } else if (k < b.length) {
                c[i] = b[k++];
            } else if (j < a.length) {
                c[i] = a[j++];
            }
        }
        return c;
    }
}