package lesson3;

public class Task3 {

    //CPU O(n * log n)
    //RAM O(n)
    public static int getMinNumberWithMaxRepeat (int[] numbers) {

        mergeSort(numbers, new int[numbers.length],0,numbers.length);

        int numberForReturn = numbers[0];
        int tempNumber = numbers[0];
        int maxCounter = 0;
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != tempNumber) {
                if (counter > maxCounter) {
                    maxCounter = counter;
                    numberForReturn = tempNumber;
                } else if (counter == maxCounter && tempNumber < numberForReturn) {
                    numberForReturn = tempNumber;
                }
                counter = 0;
                tempNumber = numbers[i];
            }
            counter++;
        }
        return numberForReturn;
    }

    //CPU O(n * log n)
    //RAM O(1)
    private static void mergeSort (int[] arrayForSort, int[] tempArray, int left, int right) {
        if (left + 1 == right) {
            return;
        }
        int middle = left + (right - left) / 2;

        mergeSort(arrayForSort,tempArray,left,middle);
        mergeSort(arrayForSort,tempArray,middle,right);
        merge(arrayForSort,tempArray,left,middle,right);
    }

    //CPU O(n)
    //RAM O(1)
    private static void merge (int[] arrayForSort, int[] tempArray, int left, int middle, int right) {
        for (int i = left, j = left, k = middle; i < right; i++) {
            if (j < middle && k < right) {
                if (arrayForSort[j] < arrayForSort[k]) {
                    tempArray[i] = arrayForSort[j++];
                } else {
                    tempArray[i] = arrayForSort[k++];
                }
            } else if (k < right) {
                tempArray[i] = arrayForSort[k++];
            } else if (j < middle) {
                tempArray[i] = arrayForSort[j++];
            }
        }
        System.arraycopy(tempArray,left,arrayForSort,left,right - left);
    }
}
