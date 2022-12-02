package it.unipv.sfw.stampante;

import it.unipv.sfw.stampante.colore.Colore;
import it.unipv.sfw.stampante.exception.InkException;

public class Cartuccia {
    public static int MAXLEVEL=1000;
    private Colore color;
    private double level;

    public Cartuccia (Colore color) {
        this.color = color;
        this.level=MAXLEVEL;
    }

    public Colore getColor() {
        return color;
    }

    public double getLevel() {
        return level;
    }

    public void useColor(double val) {
        level-=val;
    }

}
