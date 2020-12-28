import java.util.ArrayList;

import pieces.*;
import processing.core.PApplet;
import processing.core.PFont;

public class App extends PApplet {
    Piece stuk;
    PFont font;
    ArrayList<Piece> stukken;
    Seat[] seats;
    Seat activePlayer;
    EWinds windOfRound = EWinds.EAST;

    public static void main(String[] args) {
        PApplet.main("App", args);
    }

    @Override
    public void settings() {
        size(1000, 800);
    }

    @Override
    public void setup() {
        setupfont();
        generateSeats();
        stukken = Piece.getPieces();
        for (Piece piece : stukken) {
            print(piece.whoAmI());
            print(" ");
            println(piece.getIconString());
        }
        // println(stuk.whoAmI());
    }

    private void setupfont() {
        Piece.fontsetup(this);
    }

    @Override
    public void draw() {
        background(0);
        // stuk.draw(this, -9, 11);
        int i = 0;
        int y = 0;
        for (Piece piece : stukken) {
            piece.draw(this, (10) + i * 60, y * 80);
            i++;
            if (i > 15) {
                i = 0;
                y++;
            }
        }
    }

    private void generateSeats() {
        Seat[] iets = { new Seat("The Boss", EWinds.EAST), new Seat("The Bitch", EWinds.SOUTH),
                new Seat("The Bad", EWinds.WEST), new Seat("Puchow", EWinds.NORTH) };
        this.seats = iets;
        this.activePlayer = this.seats[0];
    }

    private void nextPlayer() {
        if (activePlayer.getPlayerWind().index() == seats.length) {
            activePlayer = seats[0];
        } else {
            activePlayer = seats[activePlayer.getPlayerWind().index()];
        }
        println("active player: " + activePlayer.getPlayerName());
        println("active player index: " + activePlayer.getPlayerWind().index());
    }

    @Override
    public void mouseClicked() {
        Piece.shuffelPeaces(stukken);
        nextPlayer();
        println("shuffel");
    }
}
