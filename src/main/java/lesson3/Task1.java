package lesson3;

import lesson2.Vector;

public class Task1 {

    //m - edges.length
    //n - numberOfVertex(edges.length + 1)
    //CPU O(m + n)
    //RAM O(m + n)
    public static int getHeight(int[][] edges) {
        Vector<Integer>[] vertexes = new Vector[edges.length + 1];
        for (int i = 0; i < vertexes.length; i++) {
            vertexes[i] = new Vector<>();
        }
        for (int i = 0; i < edges.length; i++) {
            vertexes[edges[i][0] - 1].add(edges[i][1] - 1);
        }
        int counter = 1;
        return recursion(counter, 0, vertexes);
    }

    private static int recursion(int counter, int currentVertex, Vector<Integer>[] vertexes) {
        for (int i = 0; i < vertexes[currentVertex].size(); i++) {
            int recursionDepth = 1;
            recursionDepth += recursion(recursionDepth, vertexes[currentVertex].get(i), vertexes);
            if (recursionDepth > counter) {
                counter = recursionDepth;
            }
        }
        return counter;
    }
}
