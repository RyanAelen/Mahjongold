package pieces;

public class Dot extends Number {
    String[] icons = { "🀙", "🀚", "🀛", "🀜", "🀝", "🀞", "🀟", "🀠", "🀡" };

    public Dot(int number) {
        super(ESimples.DOT, number);
        icon = icons[this.getnumber()-1];
    }

}
