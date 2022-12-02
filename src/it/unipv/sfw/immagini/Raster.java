package it.unipv.sfw.immagini;

import it.unipv.sfw.dati.Stampabile;
import it.unipv.sfw.stampante.colore.Colore;
import it.unipv.sfw.stampante.colore.RGBColor;

public class Raster implements Stampabile {
    private RGBColor[][] pixels;
    private static final double CONSUMO = 0.1;

    public Raster(int n) {
        this.pixels = new RGBColor[n][n];
    }

    public Raster(int n, RGBColor c) {
        /* creates a nxn image with all the pixels set to color c*/
        this.pixels = new RGBColor[n][n];
        for (int i=0; i<n;i++) {
            for (int j=0; j<n;j++) {
                pixels[i][j] = c;
            }
        }
    }

    public Raster(int n, int m) {
        this.pixels = new RGBColor[n][m];
    }

    public Raster(int n, int m, RGBColor c) {
        /* creates a nxn image with all the pixels set to color c*/
        this.pixels = new RGBColor[n][m];
        for (int i=0; i<n;i++) {
            for (int j=0; j<m;j++) {
                pixels[i][j] = c;
            }
        }
    }

    public Raster(RGBColor[][] pixels) {
        this.pixels = pixels;
    }

    @Override
    public double getNeededInk(Colore c) {
        double s = 0;
        for (RGBColor[] pixelrow : pixels) {
            for (RGBColor pixelunit : pixelrow) {
                if (pixelunit != null ) {
                    s += pixelunit.getColor(c);
                }
            }
        }
        return s*CONSUMO;
    }

    @Override
    public String toString() {
        String result =  "Foto " +pixels.length+" x " +pixels[0].length+"\n";
        for (RGBColor[] pixelrow : pixels) {
            for (RGBColor pixelunit : pixelrow) {
                result += pixelunit+"\t";
            }
            result += "\n";
        }
        result += "\n";
        result += "TotalInk: "+Colore.RED.name()+" "+getNeededInk(Colore.RED)+" "+Colore.GREEN.name()+" "+getNeededInk(Colore.GREEN)+" "+Colore.BLUE.name()+" "+getNeededInk(Colore.BLUE)+"\n";
        return result;
    }

}
