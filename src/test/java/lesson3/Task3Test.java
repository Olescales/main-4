package lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task3Test {

    @Test
    void getMinNumberWithMaxRepeatOneNumberInArray() {
        int[] numbers = new int[]{1};
        int number = Task3.getMinNumberWithMaxRepeat(numbers);
        Assertions.assertEquals(1, number);
    }

    @Test
    void getMinNumberWithMaxRepeatManyNumbersInArray() {
        int[] numbers = new int[]{1, 2, 5, 1, 2, 2, 3, 2, 1};
        int number = Task3.getMinNumberWithMaxRepeat(numbers);
        Assertions.assertEquals(2, number);
    }

    @Test
    void getMinNumberWithMaxRepeatManyNumbersInArraySecondVariant() {
        int[] numbers = new int[]{1, 2, 2, 2, 2, 2, 2, 2, 2};
        int number = Task3.getMinNumberWithMaxRepeat(numbers);
        Assertions.assertEquals(2, number);
    }
}