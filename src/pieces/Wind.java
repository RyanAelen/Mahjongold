package pieces;

/**
 * Wind
 */
public class Wind extends Piece implements IGetWind, IGetName {
    private EWinds wind;

    public Wind(EWinds wind) {
        super(EHonors.WIND);
        this.wind = wind;
        switch (this.wind) {
            case EAST:
                icon = "🀀";
                break;
            case NORTH:
                icon = "🀁";
                break;
            case SOUTH:
                icon = "🀂";
                break;
            case WEST:
                icon = "🀃";
                break;
            default:
                break;
        }
    }

    @Override
    public EWinds getWind() {
        return wind;
    }

    @Override
    public String getname() {
        return wind.toString();
    }

    @Override
    public String whoAmI() {
        return getClasseName() + ": " + wind.name();
    }

}