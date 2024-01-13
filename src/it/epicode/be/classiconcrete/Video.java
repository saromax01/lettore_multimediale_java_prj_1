package it.epicode.be.classiconcrete;

import it.epicode.be.elementoriproducibileastratto.ElementoRiproducibile;
import it.epicode.be.enterface.RegolazioneLuminosa;
import it.epicode.be.enterface.RegolazioneVolume;

public class Video extends ElementoRiproducibile implements RegolazioneVolume, RegolazioneLuminosa {
    private  int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata, volume);
        this.luminosita = luminosita;
    }

    @Override
    public void esegui() {
        play();
    }


    public void play() {
        // Ripete la stampa del titolo concatenato a una sequenza di punti esclamativi di lunghezza pari al volume
        // e poi a una sequenza di asterischi di lunghezza pari alla luminosita
        System.out.println("Video in Corso: " + getTitolo() + " - Durata: " + durata + " minuti");
        for (int i = 0; i < durata; i++) {
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            for (int k = 0; k < luminosita; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    @Override
    public int alzaLuminosita() {
        return luminosita++;
    }

    @Override
    public int abbassaLuminosita() {
        if (luminosita > 0) {
            return luminosita --;
        }
        return luminosita;
    }

    @Override
    public int alzaVolume() {
        return volume ++;
    }

    @Override
    public int abbassaVolume() {
        if (volume > 0) {
            volume --;
        }
        return volume;
    }
}
