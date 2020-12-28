package pieces;

public abstract class Bonus extends Piece implements IGetName, IGetWind {
    EWinds wind;

    protected Bonus(EBonus bonus, EWinds wind) {
        super(bonus);
        this.wind = wind;
    }

    abstract public IPlayerNumber getEnum();

    public String getname() {
        return getEnum().toString();
    }

    @Override
    public EWinds getWind() {
        return wind;
    }
}
