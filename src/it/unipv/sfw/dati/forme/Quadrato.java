package it.unipv.sfw.dati.forme;

import it.unipv.sfw.dati.Forma;
import it.unipv.sfw.stampante.colore.RGBColor;

public class Quadrato extends Forma {
    private double lato;

    public Quadrato(){
        super();
        this.lato = Math.random();
    }

    public Quadrato(double lato) {
        super();
        this.lato = lato;
    }

    public Quadrato(RGBColor col, double lato) {
        super(col);
        this.lato = lato;
    }

    @Override
    public double getArea() {
        return lato * lato;
    }

    @Override
    public double getPerimetro() {
        return 4 * lato;
    }

    @Override
    public String toString() {
        return super.toString() + " (lato=" + String.format("0.2f", this.lato) + ")\n";
    }

}
