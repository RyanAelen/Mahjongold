package pieces;

import processing.core.PApplet;

public abstract class Number extends Piece {
    private int number;

    Number(ESimples simple, int number) {
        super(simple);
        setNumber(number);
    }

    public int getnumber() {
        return number;
    }

    private void setNumber(int number) {
        this.number = PApplet.constrain(number, 1, 9);
    }

    @Override
    public String whoAmI() {
        return getClasseName() + ": " + number;
    }
}
