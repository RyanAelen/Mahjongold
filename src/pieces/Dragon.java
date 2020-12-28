package pieces;

public class Dragon extends Piece implements IGetName {
    String[] icons = { "🀄", "🀅", "🀆" };
    private EDragons dragon;

    public Dragon(EDragons dragon) {
        super(EHonors.DRAGON);
        this.dragon = dragon;
        switch (dragon) {
            case RED:
                icon = "🀄";
                break;
            case GREEN:
                icon = "🀅";
                break;
            case WHITE:
                icon = "🀆";
                break;
            default:
                break;
        }
    }

    @Override
    public String getname() {
        return dragon.toString();
    }

    @Override
    public String whoAmI() {
        return getClasseName() + ": " + dragon.name();
    }

}
