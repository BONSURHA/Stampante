package it.unipv.sfw.stampante.exception;

import it.unipv.sfw.stampante.colore.Colore;

import java.awt.print.Printable;

public class InkException extends Exception{
    private Colore color;

    public InkException(Colore c) {
        this.color=c;
    }

    public Colore getColor() {
        return color;
    }

    public void setColor(Colore color) {
        this.color = color;
    }


}
