package it.unipv.sfw.immagini;

import it.unipv.sfw.dati.Forma;
import it.unipv.sfw.dati.Stampabile;
import it.unipv.sfw.stampante.colore.Colore;
import it.unipv.sfw.stampante.colore.RGBColor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImgVect implements Stampabile {
    private List<Forma> elementi;
    private static final double CONSUMO = 0.1;

    public ImgVect() {
        this.elementi = new ArrayList<Forma>();
    }

    public void addComponente(Forma f) {
        elementi.add(f);
    }

    public double getSommaAree() {
        double s = 0;
        for (Forma m : elementi) {
            if (m != null) {
                s += m.getArea();
            }
        }
        return s;
    }

    public double getSommaAree(Colore c) {
        double s = 0;
        for (Forma m : elementi) {
            if (m != null) {
                s += m.getArea()*(m.getColore().getColor(c)/(double) RGBColor.MAXCOLOR);
            }
        }
        return s;
    }

    @Override
    public String toString() {
        /* prima della stampa si ordinano i componenti grafici per colore */
        Collections.sort(elementi);
        String s = "";
        for (Forma f : elementi) {
            if (f != null) {
                s += f;
            }
        }
        s += "TotalInk: "+Colore.RED.name()+" "+getNeededInk(Colore.RED)+" "+Colore.GREEN.name()+" "+getNeededInk(Colore.GREEN)+" "+Colore.BLUE.name()+" "+getNeededInk(Colore.BLUE)+"\n";
        return s;
    }

    @Override
    public double getNeededInk(Colore c) {
        return getSommaAree(c)*CONSUMO;
    }
}
