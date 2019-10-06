package Classes;

public enum WheelNumber {
    ONE (1), TWO(2), THREE(3), FOUR(4);
    private int number;

    WheelNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
