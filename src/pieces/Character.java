package pieces;

public class Character extends Number {
    String[] icons = { "🀇", "🀈", "🀉", "🀊", "🀋", "🀌", "🀍", "🀎", "🀏" };

    public Character(int number) {
        super(ESimples.CHARACTER, number);
        icon = icons[this.getnumber()-1];
    }
}
