package lesson3;

import lesson2.Vector;

public class Task1 {
    //n - numberOfVertex
    //m - edges.length
    //CPU O(n + m)
    //RAM O(1)
    public static int getHeight (int numberOfVertex, int[][] edges) {
        Vector<Integer>[] vertexes = new Vector[numberOfVertex];
        for (int i = 0; i < numberOfVertex; i++) {
            vertexes[i] = new Vector<>();
        }
        for (int i = 0; i < edges.length; i++) {
            vertexes[edges[i][0]-1].add(edges[i][1]-1);
        }
        int[] arrayWithResult = new int[]{0};
        int counter = 0;
        recursion(arrayWithResult, counter, 0, vertexes);
        return arrayWithResult[0];
    }

    //n = vertexes.length
    //CPU O(n)
    //RAM O(1)
    private static void recursion (int[] arrayWithResult, int counter, int currentVertex, Vector<Integer>[] vertexes) {
        counter++;
        if (counter > arrayWithResult[0]) {
            arrayWithResult[0] = counter;
        }
        for (int i = 0; i < vertexes[currentVertex].size(); i++) {
            recursion(arrayWithResult, counter, vertexes[currentVertex].get(i), vertexes);
        }
    }
}
