package it.unipv.sfw.dati.forme;

import it.unipv.sfw.dati.Forma;
import it.unipv.sfw.stampante.colore.RGBColor;

public class Cerchio extends Forma {
    private double raggio;

    public Cerchio() {
        super();
        this.raggio = Math.random();
    }

    public Cerchio(double raggio) {
        super();
        this.raggio = raggio;
    }

    public Cerchio(RGBColor col, double raggio) {
        super(col);
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double getArea() {
        return Math.PI * raggio * raggio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raggio;
    }

    @Override
    public String toString() {
        return super.toString() + " (raggio=" + String.format("0.2f", this.raggio) + ")\n";
    }
}
