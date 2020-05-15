package lesson2;

public class Salary {

    private int amount;
    private int positionId;

    public Salary(int amount, int positionId) {
        this.amount = amount;
        this.positionId = positionId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }
}
