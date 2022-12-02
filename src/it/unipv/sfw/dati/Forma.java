package it.unipv.sfw.dati;

import it.unipv.sfw.stampante.colore.RGBColor;

public abstract class Forma implements Misurabile, Comparable<Forma>{
    private RGBColor rgbColor;

    public Forma(RGBColor col){
        this.rgbColor = col;
    }

    public Forma() {
        this.rgbColor = new RGBColor();
    }
    public RGBColor getColore() {
        return rgbColor;
    }

    @Override
    public int compareTo(Forma o){
        if(this.getArea() != o.getArea()){
            return (int)(this.getArea() - o.getArea());
        } else if(this.getPerimetro() != o.getPerimetro()){
            return (int)(this.getPerimetro() - o.getPerimetro());
        }else{
            return this.rgbColor.compareTo(o.getColore());
        }
    }

    @Override
    public String toString() {
        return (this.getClass().getSimpleName() + " " + this.getColore() + " area="  + String.format("%0.2f",this.getArea()));
    }


}
