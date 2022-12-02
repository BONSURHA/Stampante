package it.unipv.sfw.dati.forme;

import it.unipv.sfw.dati.Forma;
import it.unipv.sfw.stampante.colore.RGBColor;

public class Rettangolo extends Forma {
    private double base, altezza;

    public Rettangolo(RGBColor col, double base, double altezza) {
        super(col);
        this.base = base;
        this.altezza = altezza;
    }

    public Rettangolo(double base, double altezza) {
        super();
        this.base = base;
        this.altezza = altezza;
    }

    public Rettangolo() {
        super();
        this.base = Math.random();
        this.altezza = Math.random();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public double getPerimetro() {
        return 2*(this.base + this.altezza);
    }

    @Override
    public double getArea() {
        return this.base * this.altezza;
    }

    @Override
    public String toString() {
        return super.toString() + " (altezza=" + String.format("%0.2f",this.altezza) + ", base=" +String.format("%0.2f",this.base) + ")\n";
    }
}
