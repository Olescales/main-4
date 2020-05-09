package lesson1;

public class Task2 {
    // n = multiDimArray.length
    // CPU: O(n^2 * m)
    // RAM: O(1)
    public static void sortStrings (int [][] multiDimArray) {
        for (int i = multiDimArray.length-1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                int sum1 = 0;
                int sum2 = 0;
                for (int k = 0; k < multiDimArray[j].length; k++) {
                    sum1 += multiDimArray[j-1][k];
                    sum2 += multiDimArray[j][k];
                }
                if (sum1 < sum2) {
                    int[] t = multiDimArray[j];
                    multiDimArray[j] = multiDimArray[j-1];
                    multiDimArray[j-1] = t;
                }
            }
        }
    }
}
