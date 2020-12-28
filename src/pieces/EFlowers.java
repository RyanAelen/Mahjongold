package pieces;

/**
 * EFlowers
 */
public enum EFlowers implements IPlayerNumber {
    PLUM_BLOSSOM(1), ORCHID(2), CHRYSANHEMUM(3), BAMBOO(4);

    private int index;

    EFlowers(int index) {
        this.index = index;
    }

    public int index() {
        return index-1;
    }
    public int playernumber(){
        return index;
    }

}