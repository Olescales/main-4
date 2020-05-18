package lesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task3Test {

    private Salary[] getSalaryArray() {
        Salary salary1 = new Salary(10, 2);
        Salary salary2 = new Salary(30, 2);
        Salary salary3 = new Salary(30, 1);
        Salary salary4 = new Salary(15, 2);
        Salary salary5 = new Salary(5, 0);
        Salary salary6 = new Salary(10, 3);
        Salary salary7 = new Salary(10, 3);
        Salary salary8 = new Salary(15, 2);
        Salary salary9 = new Salary(79, 2);
        Salary salary10 = new Salary(50, 0);
        Salary[] salaries = new Salary[]{salary1, salary2, salary3, salary4, salary5,
                salary6, salary7, salary8, salary9, salary10};
        return salaries;
    }

    @Test
    void getArrayMedianSalary() {
        Salary[] salaries = getSalaryArray();
        int[] result = Task3.getArrayMedianSalary(salaries);
        Assertions.assertArrayEquals(new int[]{50, 30, 15, 10}, result);
    }
}