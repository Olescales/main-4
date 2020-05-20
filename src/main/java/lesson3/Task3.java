package lesson3;

import lesson2.Vector;

public class Task3 {

    //CPU O(n * log n)
    //RAM O(n)
    public static int getMinNumberWithMaxRepeat(int[] numbers) {

        Vector<Integer> auxiliaryArray = new Vector<>();
        for (int i = 0; i < numbers.length; i++) {
            auxiliaryArray.add(numbers[i]);
        }
        auxiliaryArray.sort( (n1,n2) -> n1 - n2);

        int numberForReturn = 0;
        int tempNumber = 0;
        int maxCounter = 0;
        int counter = 0;

        for (int i = 0; i < auxiliaryArray.size(); i++) {
            if (tempNumber != auxiliaryArray.get(i)) {
                tempNumber = auxiliaryArray.get(i);
                counter = 0;
            }
            counter++;
            if (counter > maxCounter || (counter == maxCounter && tempNumber < numberForReturn)) {
                maxCounter = counter;
                numberForReturn = tempNumber;
            }
        }
        return numberForReturn;
    }
}
