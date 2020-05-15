package lesson2;

public class Task3 {

    //n = salaries.length
    //m = countArray.length
    //k ^ 2 = countArray.sort(comparator)
    //CPU O(m * k ^ 2)

    //n = countArray
    //m = countArray[].size
    //RAM O(n * m )
    public static int[] getArrayMedianSalary (Salary[] salaries) {

        int maxAmountPositionId = 0;
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i].getPositionId() > maxAmountPositionId) {
                maxAmountPositionId = salaries[i].getPositionId();
            }
        }

        Vector<Integer>[] countArray = new Vector[maxAmountPositionId + 1];
        for (int i = 0; i < countArray.length; i++) {
            countArray[i] = new Vector<>();
        }

        for (int i = 0; i < salaries.length; i++) {
            countArray[salaries[i].getPositionId()].add(salaries[i].getAmount());
        }

        int[] arrayForOutput = new int[maxAmountPositionId + 1];
        for (int i = 0; i < countArray.length; i++) {
            countArray[i].sort((o1,o2) -> o2 - o1);
            arrayForOutput[i] = countArray[i].get(countArray[i].size() / 2);
        }

        return arrayForOutput;
    }
}