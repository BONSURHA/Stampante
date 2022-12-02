package it.unipv.sfw.stampante;

import it.unipv.sfw.dati.Stampabile;
import it.unipv.sfw.stampante.colore.Colore;
import it.unipv.sfw.stampante.exception.InkException;

import java.awt.print.Printable;
import java.util.HashMap;
import java.util.Map;

public class Stampante {

    private Map<Colore, Cartuccia> cartuccie;

    public Stampante() {
        this.cartuccie = new HashMap<Colore,Cartuccia>();
        this.cartuccie.put(Colore.RED, new Cartuccia(Colore.RED));
        this.cartuccie.put(Colore.GREEN, new Cartuccia(Colore.GREEN));
        this.cartuccie.put(Colore.BLUE, new Cartuccia(Colore.BLUE));
    }

    public void cambioCartuccia(Colore c){
        this.cartuccie.put(c, new Cartuccia(c));
    }


    public void stampa(Stampabile i) throws InkException {
        try{
            for (Colore c : Colore.values()) {
                if( i.getNeededInk(c) < this.cartuccie.get(c).getLevel()){
                    (this.cartuccie.get(c)).useColor(i.getNeededInk(c));
                }else {
                    throw new InkException(c);
                }

            }
        }
        catch(InkException e){
                cambioCartuccia(e.getColor());
        }
    }

    public static void main(String[] args) {

    }
}