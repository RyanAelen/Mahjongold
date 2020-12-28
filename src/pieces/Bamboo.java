package pieces;

public class Bamboo extends Number {
    String[] icons = { "🀐", "🀑", "🀒", "🀓", "🀔", "🀕", "🀖", "🀗", "🀘" };

    public Bamboo(int number) {
        super(ESimples.BAMBOO, number);
        icon = icons[this.getnumber()-1];
    }

}
