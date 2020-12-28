package pieces;

public class Season extends Bonus {
    private ESeasons season;

    public Season(EWinds wind) {
        super(EBonus.SEASON, wind);
        season = ESeasons.values()[wind.index() - 1];
        switch (season) {
            case SPRING:
                icon = "🀦";
                break;
            case SUMMBER:
                icon = "🀧";
                break;
            case AUTUMN:
                icon = "🀨";
                break;
            case WINTER:
                icon = "🀩";
                break;
            default:
                break;
        }
    }

    public ESeasons getSeason() {
        return season;
    }

    @Override
    public IPlayerNumber getEnum() {
        return season;
    }

    @Override
    public String whoAmI() {
        return getClasseName() + ": " + season.name();
    }

}
