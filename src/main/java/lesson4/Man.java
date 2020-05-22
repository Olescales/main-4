package lesson4;

public class Man {

    private int number;
    private Man prevMan;

    public Man() {
    }

    public Man(Man prevMan) {
        this.prevMan = prevMan;
    }

    public Man(int number) {
        this.number = number;
    }

    public Man(int number, Man prevMan) {
        this.number = number;
        this.prevMan = prevMan;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Man getPrevMan() {
        return prevMan;
    }

    public void setPrevMan(Man prevMan) {
        this.prevMan = prevMan;
    }
}
