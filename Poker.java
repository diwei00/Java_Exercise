public class Poker {
    private String color;
    private int digit;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDigit() {
        return digit;
    }

    public void setDigit(int digit) {
        this.digit = digit;
    }
    public Poker(String color, int digit) {
        this.color = color;
        this.digit = digit;
    }

    @Override
    public String toString() {
        return color + " " + digit;
    }
}
