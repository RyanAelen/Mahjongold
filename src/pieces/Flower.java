package pieces;

public class Flower extends Bonus {
    private EFlowers flower;

    public Flower(EWinds wind) {
        super(EBonus.FLOWER, wind);
        flower = EFlowers.values()[wind.index() - 1];
        switch (flower) {
            case PLUM_BLOSSOM:
                icon = "🀢";
                break;
            case ORCHID:
                icon = "🀣";
                break;
            case BAMBOO:
                icon = "🀤";
                break;
            case CHRYSANHEMUM:
                icon = "🀥";
                break;
            default:
                break;
        }
    }

    public EFlowers getflower() {
        return flower;
    }

    @Override
    public IPlayerNumber getEnum() {
        return flower;
    }

    @Override
    public String whoAmI() {
        return getClasseName() + ": " + flower.name();
    }

}
