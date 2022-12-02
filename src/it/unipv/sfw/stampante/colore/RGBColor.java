package it.unipv.sfw.stampante.colore;

public class RGBColor implements Comparable<RGBColor>{
    private int r, g, b;
    public final static int MAXCOLOR = 256;

    public RGBColor() {
        this.r = (int)(Math.random()*MAXCOLOR);
        this.g = (int)(Math.random()*MAXCOLOR);
        this.b = (int)(Math.random()*MAXCOLOR);
    }

    public RGBColor(int r, int g, int b){
        this.r = r % MAXCOLOR;
        this.g = g % MAXCOLOR;
        this.b = b % MAXCOLOR;
    }

    private int getR() {
        return r;
    }

    private int getG() {
        return g;
    }

    private int getB() {
        return b;
    }

    public int getColor(Colore c) {
        switch (c) {
            case RED:
                return r;
            case GREEN:
                return g;
            case BLUE:
                return b;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return  "("+String.format("%02x",r) + "," + String.format("%02x",g) + "," + String.format("%02x",b) + ')';
    }

    @Override
    public int compareTo(RGBColor o) {
        if (o.getR() != this.r) {
            return r - o.getR();
        } else if (o.getG() != this.g) {
            return g - o.getG();
        } else {
            return b - o.getB();
        }
    }
}
