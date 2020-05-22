package lesson3;

import lesson2.Vector;

public class Task1 {

    //n - edges.length
    //CPU O(n)
    //RAM O(n)
    public static int getHeight(int[][] edges) {
        Vector<Integer>[] vertexes = new Vector[edges.length + 1];
        for (int i = 0; i < vertexes.length; i++) {
            vertexes[i] = new Vector<>();
        }
        for (int i = 0; i < edges.length; i++) {
            vertexes[edges[i][0] - 1].add(edges[i][1] - 1);
        }
        int result =  recursion(0, 0, vertexes);

        return result;
    }

    private static int recursion(int depth, int currentVertex, Vector<Integer>[] vertexes) {

        for (int i = 0; i < vertexes[currentVertex].size(); i++) {
            recursion(depth, vertexes[currentVertex].get(i), vertexes);
        }
        return 0;
    }
}
