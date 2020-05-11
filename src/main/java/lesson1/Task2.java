package lesson1;

public class Task2 {
    // n = multiDimArray.length
    // CPU: O(n^2)
    // RAM: O(n)
    public static void sortStrings (int [][] multiDimArray) {

        int[] helpArray = new int[multiDimArray.length];
        for (int i = 0; i < multiDimArray.length; i++) {
            int sum = 0;
            for (int j = 0; j < multiDimArray[i].length; j++) {
                sum += multiDimArray[i][j];
            }
            helpArray[i] = sum;
        }

        for (int i = multiDimArray.length-1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (helpArray[j] > helpArray[j-1]) {
                    int[] t = multiDimArray[j];
                    multiDimArray[j] = multiDimArray[j-1];
                    multiDimArray[j-1] = t;

                    int k = helpArray[j];
                    helpArray[j] = helpArray[j-1];
                    helpArray[j-1] = k;
                }
            }
        }
    }
}