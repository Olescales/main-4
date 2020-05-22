package lesson4;

public class Task2 {

    //CPU O(n ^ 2)
    //RAM O(1)
    public static int getNumberOfSubsequence(int[] numbers, int digit) {
        int counter = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > digit) {
                continue;
            }
            if (numbers[i] == digit) {
                counter++;
                continue;
            }
            int sum = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                sum += numbers[j];
                if (sum > digit) {
                    break;
                }
                if (sum == digit) {
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }
}
