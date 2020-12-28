package pieces;

import java.util.ArrayList;
import java.util.Collections;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PFont;

/**
 * Piece
 */
public abstract class Piece {
    static int fontsize = 64;
    public static PFont font;
    private ISet set;
    protected String icon;
    private final int WIDTH = 55, HIGHT = 73;
    private final int WIDTH_CORRECTION = -8, HIGHT_CORRECTION = 12;
    private final int RADII = 11;
    static private ArrayList<Piece> list;

    protected Piece(ISet set) {
        this.set = set;
    }

    public ISet getSet() {
        return this.set;
    }

    public void draw(PApplet app, int x, int y) {
        app.textFont(font);
        app.textAlign(PConstants.LEFT, PConstants.TOP);
        app.fill(255, 100);
        app.noStroke();
        app.rect(x, y, WIDTH, HIGHT, RADII);
        app.fill(255);
        app.text(icon, x + WIDTH_CORRECTION, y + HIGHT_CORRECTION);
    }

    public static void fontsetup(PApplet app) {
        Piece.font = app.createFont("Segoe UI Emoji", fontsize);
    }

    public void about() {
        System.out.println();
        System.out.println(set.toString());
        System.out.print("instanceof Bonus: ");
        System.out.println(this instanceof Bonus);
        System.out.print("instanceof Flower: ");
        System.out.println(this instanceof Flower);
        System.out.print("instanceof Season: ");
        System.out.println(this instanceof Season);
        System.out.print("instanceof Wind: ");
        System.out.println(this instanceof Wind);
        System.out.print("instanceof Dragon: ");
        System.out.println(this instanceof Dragon);
        System.out.print("instanceof Piece: ");
        System.out.println(this instanceof Piece);
        System.out.print("instanceof Number: ");
        System.out.println(this instanceof Number);
        System.out.print("instanceof Character: ");
        System.out.println(this instanceof Character);
        System.out.print("instanceof Bamboo: ");
        System.out.println(this instanceof Bamboo);
        System.out.print("instanceof Bot: ");
        System.out.println(this instanceof Dot);
        System.out.println();
        if (this instanceof Number) {
            System.out.println("Number is: " + ((Number) this).getnumber());
        }
        if (this instanceof IGetName) {
            System.out.println("Naam: " + ((IGetName) this).getname());
        }
        System.out.println(this.getClass().toString());
    }

    public abstract String whoAmI();

    protected String getClasseName() {
        return this.getClass().getSimpleName();
    }

    public String getIconString() {
        return icon;
    }

    static public ArrayList<Piece> getPieces() {
        if (list != null) {
            return list;
        }
        ArrayList<Piece> list = new ArrayList<>();
        ArrayList<Piece> dots = new ArrayList<>();
        ArrayList<Piece> chars = new ArrayList<>();
        ArrayList<Piece> bombos = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < 4; j++) {
                dots.add(new Dot(i));
                chars.add(new Character(i));
                bombos.add(new Bamboo(i));
            }
        }
        list.addAll(dots);
        list.addAll(chars);
        list.addAll(bombos);
        ArrayList<Piece> flowers = new ArrayList<>();
        ArrayList<Piece> seasons = new ArrayList<>();
        ArrayList<Piece> winds = new ArrayList<>();
        for (EWinds wind : EWinds.values()) {
            for (int i = 0; i < 4; i++) {
                winds.add(new Wind(wind));
            }
            flowers.add(new Flower(wind));
            seasons.add(new Season(wind));
        }
        list.addAll(winds);
        list.addAll(flowers);
        list.addAll(seasons);
        for (EDragons dragon : EDragons.values()) {
            for (int i = 0; i < 4; i++) {
                list.add(new Dragon(dragon));
            }
        }
        return list;
    }

    static public void shuffelPeaces(ArrayList<Piece> list) {
        Collections.shuffle(list);
    }
}