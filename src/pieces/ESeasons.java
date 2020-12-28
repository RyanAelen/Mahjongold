package pieces;

public enum ESeasons implements IPlayerNumber {
    SPRING(1), SUMMBER(2), AUTUMN(3), WINTER(3);

    private int index;

    ESeasons(int index) {
        this.index = index;
    }

    @Override
    public int index() {
        return index;
    }

}
