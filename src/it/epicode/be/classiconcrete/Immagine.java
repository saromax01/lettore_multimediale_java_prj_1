package it.epicode.be.classiconcrete;

import it.epicode.be.elementomultimedialeastratto.ElementoMultimediale;
import it.epicode.be.enterface.RegolazioneLuminosa;

public class Immagine extends ElementoMultimediale implements RegolazioneLuminosa {
    private int luminosita;
    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void show() {
        System.out.println("Immagine: " + getTitolo() + " - Luminosita: " + luminosita);
        // Stampa sequenza di asterischi di lunghezza pari a luminosita
        for (int i = 0; i < luminosita; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    @Override
    public int alzaLuminosita() {
        return luminosita ++;
    }

    @Override
    public int abbassaLuminosita() {
        if (luminosita > 0) {
            luminosita --;
        }
        return luminosita;
    }

    @Override
    public void esegui() {
        show();
    }
}
