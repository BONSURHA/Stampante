package it.unipv.sfw.dati;

import it.unipv.sfw.stampante.colore.Colore;

public interface Stampabile {
    double getNeededInk(Colore c);
}
