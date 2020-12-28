package pieces;

public enum EWinds implements IPlayerNumber {
    EAST(1), SOUTH(2), WEST(3), NORTH(4);

    private int index;

    EWinds(int index) {
        this.index = index;
    }

    public int index() {
        return index;
    }
}
