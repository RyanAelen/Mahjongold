import pieces.*;

public class Seat {
    private EWinds playersWind;
    private int tablePostion;
    private String name;

    public Seat(String name, EWinds wind) {
        this.name = name;
        this.playersWind = wind;
        this.tablePostion = getPlayerIndex();
        System.out.println(this.name);
    }

    public EWinds getPlayerWind() {
        return playersWind;
    }

    public int getTablePostion() {
        return tablePostion;
    }

    public int getPlayerIndex() {
        return playersWind.index();
    }

    public String getPlayerName() {
        return name;
    }

    public EWinds getWindFromOtherSeat(EWinds wind) {
        this.playersWind = wind;
        return this.playersWind;
    }
}
